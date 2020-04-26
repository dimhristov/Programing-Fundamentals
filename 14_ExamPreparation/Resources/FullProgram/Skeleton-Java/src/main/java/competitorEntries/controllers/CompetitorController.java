package competitorEntries.controllers;

import competitorEntries.bindingModels.CompetitorBindingModel;
import competitorEntries.entities.Competitor;
import competitorEntries.repositories.CompetitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CompetitorController {
    private final CompetitorRepository competitorRepository;

    @Autowired
    public CompetitorController(CompetitorRepository competitorRepository) {
        this.competitorRepository = competitorRepository;
    }


    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        // TODO: Implement me
        return null;
    }

    @GetMapping("/create")
    public ModelAndView create(ModelAndView modelAndView) {
        // TODO: Implement me
        return null;
    }

    @PostMapping("/create")
    public String create(Competitor competitor) {
        // TODO: Implement me
        return null;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable(value = "id") Integer id, ModelAndView modelAndView) {
        // TODO: Implement me
        return null;
    }

    @PostMapping("edit/{id}")
    public String edit(@PathVariable(value = "id") Integer id, CompetitorBindingModel bookBindingModel) {
        // TODO: Implement me
        return null;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView remove(@PathVariable(value = "id") Integer id, ModelAndView modelAndView) {
        // TODO: Implement me
        return null;
    }

    @PostMapping("/delete/{id}")
    public String remove(Competitor competitor) {
        // TODO: Implement me
        return null;
    }
}
