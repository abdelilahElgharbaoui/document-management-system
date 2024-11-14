package com.mundia.msdocuments.services;

import com.mundia.msdocuments.dto.DocumentReq;
import com.mundia.msdocuments.entities.Document;
import com.mundia.msdocuments.mappers.DocumentMapper;
import com.mundia.msdocuments.repositories.DocumentRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {
    final DocumentRepo documentRepo;
    final DocumentMapper documentMapper;
//    final WebClient webClient;

    @Override
    public List<Document> getAllDocuments() {
        return documentRepo.findAll();
    }

    @Override
    public Document getDocumentById(long id) {
        Optional<Document> optionalDocument=documentRepo.findById(id);
        if(optionalDocument.isPresent()){
            return optionalDocument.get();
        }else{
            throw new EntityNotFoundException("Document with id "+id+" not found");
        }
    }

    @Override
    public List<Document> getDocumentByTitle(String name) {
        return documentRepo.findAllByTitre(name);
    }

    @Override
    public Document addDocument(DocumentReq document) {
        Document document1 = documentMapper.fromDocumentReq(document);
        documentRepo.save(document1);
        return document1;
    }

    @Override
    public Document updateDocument(long id, DocumentReq documentReq) {
        Document existingDocument = documentRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Document with id " + id + " not found"));

        existingDocument.setTitre(documentReq.getTitre());
        existingDocument.setContenu(documentReq.getContenu());
        existingDocument.setProprietaireId(documentReq.getProprietaireId());

        return documentRepo.save(existingDocument);
    }


    @Override
    public void deleteDocument(long id) {
        Document existingDocument = documentRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Document with id " + id + " not found"));

        documentRepo.delete(existingDocument);
    }
}
