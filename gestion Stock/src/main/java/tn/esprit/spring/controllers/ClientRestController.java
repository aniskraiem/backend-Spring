package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.ClientSerivce;

@RestController
@Api(tags="gestion des clients")
@RequestMapping("/client")
public class ClientRestController {
	@Autowired
	ClientSerivce clientservice;
	@ApiOperation(value="Recuperer les clients")
	@GetMapping("/retrieve-all-clients")
	@ResponseBody
	public List<Client> getClients(){
		List<Client> list=clientservice.retrieveAllClients();
		return  list;
	}
	@ApiOperation(value="ajouter un clients")
	@PostMapping("/add-client")
	@ResponseBody
	public Client addClient(@RequestBody Client client){
		Client c=clientservice.addClient(client);
				return c;
	}
	@ApiOperation(value="Recuperer un client")

	@GetMapping("/retrieve-client/{client-id}")
	@ResponseBody
	public Client retrieveClient(@PathVariable("client-id")Long id){
		Client c =clientservice.retrieveClient(id);
		return c;
	}
	@ApiOperation(value="supprimer un clients")

	@DeleteMapping("remove-client/{client-id}")
	@ResponseBody
	public void removeClient(@PathVariable("client-id")Long id)
	{
		clientservice.deleteClient(id);
	}
}