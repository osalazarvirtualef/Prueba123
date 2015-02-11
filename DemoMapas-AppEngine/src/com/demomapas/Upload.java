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
	//	XmppSincronizacion xmpp = new XmppSincronizacion();
	//	xmpp.enviaMensaje("osalazar@adquem.com", "llegue a la peticion");
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
		
		
		
		
		// /

		switch (tipo) {
		

		case 0:

			//multimedia = new Multimedia();

			//multimediaEndpoint = new MultimediaEndpoint();

			path = blobKey.getKeyString();
			log.warning(path);

			// /

			ImagesService imagesService = ImagesServiceFactory
					.getImagesService();

			ServingUrlOptions servingOptions = ServingUrlOptions.Builder
					.withBlobKey(blobKey);

			String servingUrl = imagesService.getServingUrl(servingOptions);

			res.setStatus(HttpServletResponse.SC_OK);
			//xmpp.enviaMensaje("osalazar@adquem.com", " ok1");

			res.setContentType("application/json");

			JSONObject json = new JSONObject();

			try {

				json.put("servingUrl", servingUrl);

			} catch (JSONException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}

			try {

				json.put("blobKey", blobKey.getKeyString());

			} catch (JSONException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}

			out.print(json.toString());
			//xmpp.enviaMensaje("osalazar@adquem.com", " out print 1");

			out.flush();

			out.close();

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

			Date date = new Date();

			String time = sdf.format(date);

			// insertaMultimedia();

		

			//extension = mb.tipoFormato(formato);

			//multimedia.setFormato(Long.parseLong(req.getParameter("formato")));

			//multimedia.setDescripcion(req.getParameter("descripcion"));

			//multimedia.setFecha(time);

			//multimedia.setIdMultimedia(returnId() + 1);

			//multimedia.setIdReferencia(Long.parseLong(req
			//		.getParameter("idReferencia")));// identificador unico de
													// obra o proyecto

			// multimedia.setIdReferencia(Integer.parseInt(req.getParameter("idReferencia")));//identificador
			// unico de obra o proyecto

			//multimedia.setPath(path);// blobkey

			//multimedia.setTipoArchivo(Integer.parseInt(req
			//		.getParameter("tipoArchivo")));// imagen o video

			//multimedia.setTipoReferencia(Integer.parseInt(req
			//		.getParameter("tipoReferencia")));// si pertenece a obra o
														// proyecto puedes ser
														// el id de obra o de
														// proyecto y hay que
														// distinguirlos

			try {

			//	multimediaEndpoint.insertMultimedia(multimedia);

			} catch (Exception e) {

				// TODO: handle exception

				error += e.getMessage();

				out.write(new Gson().toJson(error));

				res.setStatus(HttpServletResponse.SC_OK);
			//	xmpp.enviaMensaje("osalazar@adquem.com", " ok2");

				res.setContentType("application/json");

				try {

					json.put("servingUrl", servingUrl);
			//		xmpp.enviaMensaje("osalazar@adquem.com", " json put 1");

				} catch (JSONException e1) {

					// TODO Auto-generated catch block

					e1.printStackTrace();

				}

				try {

					json.put("blobKey", blobKey.getKeyString());
			//		xmpp.enviaMensaje("osalazar@adquem.com", " blobkey get string 1");

				} catch (JSONException e1) {

					// TODO Auto-generated catch block
			//		xmpp.enviaMensaje("osalazar@adquem.com", " catch1");
					e1.printStackTrace();

				}

				out.print(json.toString());
			//	xmpp.enviaMensaje("osalazar@adquem.com", " out2");
				out.flush();

				out.close();

				try {

			//		multimediaEndpoint.insertMultimedia(multimedia);
			//		xmpp.enviaMensaje("osalazar@adquem.com", "insert multimedia ");

				} catch (Exception e1) {
			//		xmpp.enviaMensaje("osalazar@adquem.com", " error 1 + "+e1.getMessage());
					// TODO: handle exception

					error += e1.getMessage();

					out.write(new Gson().toJson(error));

				}

			}

			res.setContentType("application/x-download");
			//xmpp.enviaMensaje("osalazar@adquem.com", "application/x-download");

		//	blobstoreService.serve(blobKey, res);

			try {

				json.put("servingUrl", servingUrl);
			//	xmpp.enviaMensaje("osalazar@adquem.com", " json put 2");

			} catch (JSONException e1) {

				// TODO Auto-generated catch block
			//	xmpp.enviaMensaje("osalazar@adquem.com", " error json");
				e1.printStackTrace();

			}

			try {

				json.put("blobKey", blobKey.getKeyString());
			//	xmpp.enviaMensaje("osalazar@adquem.com", " blobkey get string 7654");

			} catch (JSONException e1) {

				// TODO Auto-generated catch block

				e1.printStackTrace();

			}

			out.print(json.toString());
			//xmpp.enviaMensaje("osalazar@adquem.com", " out 2");

			out.flush();

			out.close();

			try {

			//	multimediaEndpoint.insertMultimedia(multimedia);

			} catch (Exception e1) {
			//	xmpp.enviaMensaje("osalazar@adquem.com", " error: "+ e1.getMessage());
				// TODO: handle exception

				error += e1.getMessage();

				out.write(new Gson().toJson(error));

			}

			break;

		}

		// /

	}



}