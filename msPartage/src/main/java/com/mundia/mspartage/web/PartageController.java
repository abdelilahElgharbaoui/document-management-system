package com.mundia.mspartage.web;

import com.mundia.mspartage.dto.PartageDTO;
import com.mundia.mspartage.entities.Partage;
import com.mundia.mspartage.services.PartageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partages")
@RequiredArgsConstructor
public class PartageController {

    private final PartageService partageService;

    // Get all partages
    @GetMapping("/all")
    public List<PartageDTO> getAllPartages() {

        return partageService.getAllPartages();
    }

    // Get partages by document ID
    @GetMapping("/document/{documentId}")
    public List<Partage> getPartagesByDocumentId(@PathVariable Long documentId) {
        return partageService.getPartagesByDocumentId(documentId);
    }

    // Get partages by utilisateur ID
    @GetMapping("/utilisateur/{utilisateurId}")
    public List<Partage> getPartagesByUtilisateurId(@PathVariable Long utilisateurId) {
        return partageService.getPartagesByUtilisateurId(utilisateurId);
    }

    // Add a partage
    @PostMapping("/add")
    public Partage addPartage(@RequestParam Long documentId, @RequestParam Long utilisateurId) {
        return partageService.addPartage(documentId, utilisateurId);
    }

    // Delete a partage
    @DeleteMapping("/delete/{id}")
    public void deletePartage(@PathVariable Long id) {
        partageService.deletePartage(id);
    }
}
