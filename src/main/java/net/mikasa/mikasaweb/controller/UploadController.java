package net.mikasa.mikasaweb.controller;

import net.mikasa.mikasaweb.model.Execution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/executions")
public class UploadController {
	
	private static Logger log = LoggerFactory.getLogger(UploadController.class);
	
	@RequestMapping(value="/files",method=RequestMethod.GET)
    public String showFiles() {
		log.info("GET request received");
		return "File Upload controller";
    }
	
	@RequestMapping(value="/files",method=RequestMethod.POST)
	@ResponseBody
    public String getFiles(@RequestParam("file") MultipartFile file) {
		log.info("File upload request received: " + file.getName());
		return ("OK");
    }
	
	@RequestMapping(value="/streams",method=RequestMethod.PUT)
	@ResponseBody
	public String updateExecutions(@RequestPart("file") MultipartFile multipartFile, @RequestBody Execution execution)
	{
		log.info("Update Execution request received: " + execution.getName());
		return "OK";
	}

}