package com.mundia.msdocuments.services;

import com.mundia.msdocuments.dto.DocumentDTO;
import com.mundia.msdocuments.dto.DocumentReq;
import com.mundia.msdocuments.entities.Document;

import java.util.List;

public interface DocumentService {
    List<Document> getAllDocuments();
    Document getDocumentById(long id);
    List<Document> getDocumentByTitle(String name);
    Document addDocument(DocumentReq document);
    Document updateDocument(long id,DocumentReq document);
    void deleteDocument(long id);
}
