package com.example.demoSpringBoot.API;

import java.io.BufferedReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpringBoot.RequestAPI;
import com.example.demoSpringBoot.entities.*;

@RestController
@RequestMapping("/api/test")
public class Test {
	@Autowired
	private RequestAPI API;
	@GetMapping("/{option}")
	private  ResponseEntity<String> getAll(@PathVariable int option) throws IOException, InterruptedException {
		String line;
		String data="";
		API.receiveData(option,"");
        BufferedReader reader = API.getReader(option);
		while((line=reader.readLine())!=null) {
			data=line+"\n";
		}
		reader.close();
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@GetMapping("/{option}/ID")
	private  ResponseEntity<String> getOne(@PathVariable int option,@RequestParam int id) throws IOException, InterruptedException {
		String line;
		String data="";
		API.receiveData(option,id);
        BufferedReader reader = API.getReader(option);
		while((line=reader.readLine())!=null) {
			data=line+"\n";
		}
		reader.close();
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@GetMapping("/{option}/musics/singer")
	private  ResponseEntity<String> getMusics(@PathVariable int option,@RequestParam int id) throws IOException, InterruptedException {
		String line;
		String data="";
		API.receiveData(option,id);
        BufferedReader reader = API.getReader(option);
		while((line=reader.readLine())!=null) {
			data=line+"\n";
		}
		reader.close();
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@PostMapping("/{option}/musics")
	private  ResponseEntity<String> searchMusics(@PathVariable int option,@RequestBody Music o) throws IOException, InterruptedException {
		String line;
		String data="";
		API.receiveData(option,o.toString());
        BufferedReader reader = API.getReader(option);
		while((line=reader.readLine())!=null) {
			data=line+"\n";
		}
		reader.close();
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@DeleteMapping("/{option}")
	private  ResponseEntity<String> delete(@PathVariable int option,@RequestParam int id) throws IOException, InterruptedException {
		String line;
		String data="";
		API.receiveData(option,id);
        BufferedReader reader = API.getReader(option);
		while((line=reader.readLine())!=null) {
			data=line+"\n";
		}
		reader.close();
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@PostMapping("/{option}/music")
	private  ResponseEntity<String> postMusic(@PathVariable int option, @RequestBody Music o) throws IOException, InterruptedException {
		String line;
		String data="";
		API.receiveData(option,o.toString());
//		System.out.println(o.toString());
        BufferedReader reader = API.getReader(option);
		while((line=reader.readLine())!=null) {
			data=line+"\n";
		}
		reader.close();
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@PostMapping("/{option}/musician")
	private  ResponseEntity<String> postMusician(@PathVariable int option, @RequestBody Musician o) throws IOException, InterruptedException {
		String line;
		String data="";
		API.receiveData(option,o.toString());
		System.out.println(o.toString());
        BufferedReader reader = API.getReader(option);
		while((line=reader.readLine())!=null) {
			data=line+"\n";
		}
		reader.close();
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@PostMapping("/{option}/singer")
	private  ResponseEntity<String> postSinger(@PathVariable int option, @RequestBody Singer o) throws IOException, InterruptedException {
		String line;
		String data="";
		System.out.println(o.toString());
		API.receiveData(option,o.toString());
        BufferedReader reader = API.getReader(option);
		while((line=reader.readLine())!=null) {
			data=line+"\n";
		}
		reader.close();
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@PostMapping("/{option}/album")
	private  ResponseEntity<String> postAlbum(@PathVariable int option, @RequestBody Album o) throws IOException, InterruptedException {
		String line;
		String data="";
		System.out.println(o.toString());
		API.receiveData(option,o.toString());
        BufferedReader reader = API.getReader(option);
		while((line=reader.readLine())!=null) {
			data=line+"\n";
		}
		reader.close();
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
	@PostMapping("/{option}/type")
	private  ResponseEntity<String> postType(@PathVariable int option, @RequestBody Type o) throws IOException, InterruptedException {
		String line;
		String data="";

		API.receiveData(option,o.toString());
        BufferedReader reader = API.getReader(option);
		while((line=reader.readLine())!=null) {
			data=line+"\n";
		}
		reader.close();
		return new ResponseEntity<String>(data,HttpStatus.OK);
	}
}
