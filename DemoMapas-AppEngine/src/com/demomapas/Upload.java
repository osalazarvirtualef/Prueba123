package com.demomapas;



import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.blobstore.BlobInfoFactory;
import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.google.appengine.api.blobstore.UploadOptions;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.appengine.api.images.ServingUrlOptions;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.google.gson.Gson;



public class Upload extends HttpServlet {
	public static final Logger log = Logger.getLogger(Upload.class.getName());

	private BlobstoreService blobstoreService = BlobstoreServiceFactory
			.getBlobstoreService();

	//private Multimedia multimedia;
	//private MultimediaEndpoint multimediaEndpoint;
	private String path;
	private String extension;
	private int referencia;
	private int tipo;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)

	throws ServletException, IOException {
		
		log.warning("llegue al upload");
		List<BlobKey> blobs = blobstoreService.getUploads(req).get("file");
		BlobInfoFactory bi = new BlobInfoFactory();
		BlobKey blobKey = blobs.get(0);
		String fname = bi.loadBlobInfo(blobKey).getFilename();
		String ConType = bi.loadBlobInfo(blobKey).getContentType();
	//	MultimediaBusiness mb = new MultimediaBusiness();
		PrintWriter out = res.getWriter();
		String error = "";
	
	//	xmpp.enviaMensaje("osalazar@adquem.com", "el elemento que llego es: "+fname + ConType);
		
		
		
		
		
		
		
		
		 Integer tipo = new Integer(0);
		 //tipo =  Integer.parseInt(req.getParameter("tipoArchivo"));
	//	if(Integer.parseInt(req.getParameter("tipoArchivo"))==Constants.Minuta) tipo = Integer.valueOf(Constants.imagen);
	//	xmpp.enviaMensaje("osalazar@adquem.com", "el valor de tipo es: "+tipo);
		
		 log.warning("aqui si llego");
		
		
		// /
		 
		switch (tipo) {
		

		case 0:
			log.warning("entre al metodo case 0");

		

			path = blobKey.getKeyString();

			// /

			ImagesService imagesService = ImagesServiceFactory
					.getImagesService();

			ServingUrlOptions servingOptions = ServingUrlOptions.Builder
					.withBlobKey(blobKey);

			String servingUrl = imagesService.getServingUrl(servingOptions);
			log.warning("serving Url: "+servingUrl);

			res.setStatus(HttpServletResponse.SC_OK);
		

			res.setContentType("application/json");

			JSONObject json = new JSONObject();

			try {

				json.put("servingUrl", servingUrl);
				log.warning("try: ");

			} catch (JSONException e) {

				// TODO Auto-generated catch block
				log.warning("catch");
				e.printStackTrace();

			}

			try {

				json.put("blobKey", blobKey.getKeyString());

			} catch (JSONException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}

			out.print(json.toString());


			out.flush();

			out.close();

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

			Date date = new Date();

			String time = sdf.format(date);

			// insertaMultimedia();

			 

			

			

			// multimedia.setIdReferencia(Integer.parseInt(req.getParameter("idReferencia")));//identificador
			// unico de obra o proyecto

			
		

			res.setContentType("application/x-download");
		

			blobstoreService.serve(blobKey, res);

			try {

				json.put("servingUrl", servingUrl);
				
			} catch (JSONException e1) {

				// TODO Auto-generated catch block
				
				e1.printStackTrace();

			}

			try {

				json.put("blobKey", blobKey.getKeyString());
				
			} catch (JSONException e1) {

				// TODO Auto-generated catch block

				e1.printStackTrace();

			}

			out.print(json.toString());
			

			out.flush();

			out.close();

		

			break;

		}

		// /

	}



}