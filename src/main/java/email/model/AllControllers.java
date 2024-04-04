package email.model;

import email.model.AppointmentForm;
import email.model.ContactsForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AllControllers {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @GetMapping("/price")
    public String price() {
        return "price";
    }

    @GetMapping("/appointment")

    public String appointment(Model model) {
        model.addAttribute("appointmentForm", new AppointmentForm());
        return "appointment";
    }

    @PostMapping("/subscribe")
    public String subscribe(@ModelAttribute AppointmentForm appointmentForm, Model model) {
        /*if (appointmentForm.getSurname().isEmpty()) {
            model.addAttribute("error", " Поле 'Фамилия' не должно быть пустым");
            return "appointment";
        }
        if (appointmentForm.getFirstName().isEmpty()) {
            model.addAttribute("error", " Поле 'Имя' не должно быть пустым");
            return "appointment";
        }
        if (appointmentForm.getPhone().isEmpty()) {
            model.addAttribute("error", " Поле 'Телефон' не должно быть пустым");
            return "appointment";
        }
        if (appointmentForm.getMessage().isEmpty()) {
            model.addAttribute("error", " Поле 'Текст обращения' не должно быть пустым");
            return "appointment";
        }*/

        return "resultApp";
    }

    @GetMapping("/contacts")
    public String contacts() {
        return "contacts";
    }

    @PostMapping("/sendMessage")
    public String sendMessage(@ModelAttribute ContactsForm contactsForm, Model model) {
        if (contactsForm.getFio().isEmpty()) {
            model.addAttribute("error", " Поле 'ФИО' не должно быть пустым");
            return "contacts";
        }
        if (contactsForm.getPhone().isEmpty()) {
            model.addAttribute("error", " Поле 'Телефон' не должно быть пустым");
            return "contacts";
        }
        if (contactsForm.getMessage().isEmpty()) {
            model.addAttribute("error", " Поле 'Текст обращения' не должно быть пустым");
            return "contacts";
        }
        return "resultSend";
    }
}
