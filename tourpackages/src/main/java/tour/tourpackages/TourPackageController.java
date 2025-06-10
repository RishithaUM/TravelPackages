package tour.tourpackages;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/packages")
public class TourPackageController {

    @Autowired
    private TourPackageService tourPackageService;

    // 1. Add a new travel package
    @PreAuthorize("hasAuthority('admin')")
    @PostMapping("/add")
    public TourPackage addPackage(@RequestBody TourPackage tourPackage) {
        return tourPackageService.addPackage(tourPackage);
    }

    // 2. Delete a package by ID
     @PreAuthorize("hasAuthority('admin')")
@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deletePackage(@PathVariable Long id) {
    tourPackageService.deletePackage(id);
    return ResponseEntity.ok("Deleted successfully");
}

    // 3. View all packages
     @PreAuthorize("hasAnyAuthority('admin','customer')")
    @GetMapping("/all")
    public List<TourPackage> getAllPackages() {
        return tourPackageService.getAllPackages();
    }

    // 4. Filter by destination, price range, and duration
   
     @PreAuthorize("hasAnyAuthority('admin','customer')")
    @GetMapping("/filter")
    public List<TourPackage> filterPackages(
            @RequestParam(required = false) String destination,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) Integer minDays,
            @RequestParam(required = false) Integer maxDays
    ) {
        return tourPackageService.filterPackages(destination, minPrice, maxPrice, minDays, maxDays);
    }

    // 5. Search by keyword (destination or description)
     @PreAuthorize("hasAnyAuthority('admin','customer')")
    @GetMapping("/search")
    public List<TourPackage> searchPackages(@RequestParam String keyword) {
        return tourPackageService.searchPackages(keyword);
    }

    // 6. View details of one package
     @PreAuthorize("hasAnyAuthority('admin','customer')")
    @GetMapping("/{id}")
    public TourPackage getPackageDetails(@PathVariable Long id) {
        return tourPackageService.getPackageById(id);
    }
    
    // 7. Update a package by ID
     @PreAuthorize("hasAuthority('admin')")

    @PutMapping("/update/{id}")
    public TourPackage updatePackage(@PathVariable Long id, @RequestBody @Valid TourPackage tourPackage) {
        return tourPackageService.updatePackage(id, tourPackage); // Throws ResourceNotFoundException if not found
    }
}
