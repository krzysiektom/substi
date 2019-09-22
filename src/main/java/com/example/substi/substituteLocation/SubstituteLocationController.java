package com.example.substi.substituteLocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("locations")
public class SubstituteLocationController {

   private final SubstituteLocationRepository locationRepository;

    public SubstituteLocationController(SubstituteLocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping("/all")
    public String allLocation(Model model) {
        model.addAttribute("locations", locationRepository.findAll());
        return "locations/allLocations";
    }


    @PostMapping("/add")
    public String addLocation(@ModelAttribute("location") @Valid SubstituteLocation location, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "locations/locationForm";
        }
        locationRepository.save(location);
        return "redirect:/locations/all";
    }

    @GetMapping("/edit/{id}")
    public String showForm(@PathVariable Long id, Model model) {
        model.addAttribute("location", locationRepository.getOne(id));
        return "locations/locationForm";
    }

    @PostMapping("/edit/{id}")
    public String editlocation(@ModelAttribute("location") @Valid SubstituteLocation location, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "locations/locationForm";
        }
        locationRepository.save(location);
        return "redirect:/locations/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteLocation(@PathVariable Long id) {
        locationRepository.delete(locationRepository.getOne(id));
        return "redirect:/locations/all";
    }

}
