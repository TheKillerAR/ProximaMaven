package controller;

import java.sql.SQLException;
import java.util.ArrayList;

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

	@RequestMapping("/PreImpiegato")
	public String CreaImpiegato(Model model) {

		model.addAttribute("impForm", new ImpiegatoSpring());

		return "jspIMPIEGATO/impiegato";
	}

	@RequestMapping(value = "/Insertimpiegato", method = RequestMethod.POST)
	public String insertImpiegato(@ModelAttribute("impForm") ImpiegatoSpring impForm, ModelMap model) {
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

		return "jspIMPIEGATO/esitopositivo";
	}

	@RequestMapping(value = "/Searchidimpiegato", method = RequestMethod.POST)
	public String searchIdimpiegato(@ModelAttribute("impForm") ImpiegatoSpring impForm, ModelMap model) {

		ImpiegatoDao dao = new ImpiegatoDao();

		Impiegato imp = new Impiegato();

		int x = impForm.getId();

		imp.setId(x);
		imp.setCf(impForm.getCf());
		imp.setNome(impForm.getNome());
		imp.setCognome(impForm.getCognome());

		ArrayList<Impiegato> listaImp = new ArrayList<Impiegato>();

		try {
			imp = dao.searchId(x);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		listaImp.add(imp);

		model.addAttribute("listaImp", listaImp);

		return "jspIMPIEGATO/rsmostratuttiimpiegati";
	}

	@RequestMapping(value = "/Searchnomeimpiegato", method = RequestMethod.POST)
	public String searchNomeimpiegato(@ModelAttribute("impForm") ImpiegatoSpring impForm, ModelMap model) {

		ImpiegatoDao dao = new ImpiegatoDao();

		try {
			ArrayList<Impiegato> listaImp = dao.searchNome(impForm.getNome());

			model.addAttribute("listaImp", listaImp);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "jspIMPIEGATO/rsmostratuttiimpiegati";
	}

	@RequestMapping(value = "/Searchcognomeimpiegato", method = RequestMethod.POST)
	public String searchCognomeimpiegato(@ModelAttribute("impForm") ImpiegatoSpring impForm, ModelMap model) {

		ImpiegatoDao dao = new ImpiegatoDao();

		try {
			ArrayList<Impiegato> listaImp = dao.searchCognome(impForm.getCognome());

			model.addAttribute("listaImp", listaImp);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "jspIMPIEGATO/rsmostratuttiimpiegati";
	}

	@RequestMapping(value = "/Searchcfimpiegato", method = RequestMethod.POST)
	public String searchCfimpiegato(@ModelAttribute("impForm") ImpiegatoSpring impForm, ModelMap model) {

		ImpiegatoDao dao = new ImpiegatoDao();

		Impiegato imp = new Impiegato();

		String c = impForm.getCf();

		imp.setCf(c);
		imp.setNome(impForm.getNome());
		imp.setCognome(impForm.getCognome());

		ArrayList<Impiegato> listaImp = new ArrayList<Impiegato>();

		try {
			imp = dao.searchCf(c);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		listaImp.add(imp);

		model.addAttribute("listaImp", listaImp);

		return "jspIMPIEGATO/rsmostratuttiimpiegati";
	}

	@RequestMapping("/Deleteimpiegato")

	public String deleteimpiegato(@ModelAttribute("ImpForm") Impiegato ImpForm, Model model) {

		ImpiegatoDao dao = new ImpiegatoDao();
		int x = ImpForm.getId();
		System.out.println(x);
		boolean check = dao.delete(x);

		return "esitopositivo";
	}
	
//	@RequestMapping("/Mostratuttiimpiegati")
//
//	public String mostraTuttiimpiegati(@ModelAttribute("impForm") Impiegato ImpForm, Model model) {
//		
//	}
}