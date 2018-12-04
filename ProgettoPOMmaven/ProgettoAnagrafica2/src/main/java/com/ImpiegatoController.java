package com;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.ImpiegatoDao;
import form.ImpiegatoSpring;
import model.Impiegato;

@Controller
public class ImpiegatoController {

	@RequestMapping("/impiegato")
	public String CreaImpiegato(Model model) {

		model.addAttribute("impForm", new ImpiegatoSpring());

		return "jspIMPIEGATO/impiegato";
	}

	@RequestMapping(value = "/Insertimpiegato", method = RequestMethod.POST)
	public String insertImpiegato(@ModelAttribute("impForm") Impiegato impForm, ModelMap model) {
		ImpiegatoDao dao = new ImpiegatoDao();

		Impiegato imp = new Impiegato();

		imp.setCf(impForm.getCf());
		imp.setNome(impForm.getNome());
		imp.setCognome(impForm.getCognome());

		try {
			dao.insert(imp);
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return "esitopositivo";
	}

}