package com.bolsadeideas.springboot.app;

//import java.nio.file.Paths;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//para ver  las imagenes en la vista
@Configuration
public class MvcConfig implements WebMvcConfigurer{
	
	//debug del resource path
	//private final Logger log= LoggerFactory.getLogger(getClass()); 
/*	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		
		//toUri toma el path y agrega el esquema "file:/" y lo convierte a string
		String resourcePath = Paths.get("uploads").toAbsolutePath().toUri().toString();
		log.info(resourcePath); // pra visulaizar la ruta en consola
		//registrar la nueva ruta con recursos estaticos
		//agregamos doble * para mapear al nombre de la img y que esta se pueda cargar en ver.html,
		//corresponden a un nombre variable de la img
		// solo es la url que apunta al dir fisico
		registry.addResourceHandler("/uploads/**")
		.addResourceLocations(resourcePath);//contiene el uploads con la ruta absoluta con esquema file:/
	}*/

	
}
