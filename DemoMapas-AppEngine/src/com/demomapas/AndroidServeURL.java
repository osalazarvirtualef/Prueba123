package com.demomapas;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;

public class AndroidServeURL extends HttpServlet{
	public static final Logger log = Logger.getLogger(AndroidServeURL.class.getName());
	  private BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws IOException {
log.warning("llego una peticion de android");
	//"uploaded" is another servlet which will send UploadUrl and blobkey to android client
	String blobUploadUrl = blobstoreService.createUploadUrl("/blob/upload"); 
	log.warning("el blobUploadUrl es: "+blobUploadUrl);
	        resp.setStatus(HttpServletResponse.SC_OK);
	        resp.setContentType("text/plain");

	        PrintWriter out = resp.getWriter();
	        out.print(blobUploadUrl);
	    }
}
