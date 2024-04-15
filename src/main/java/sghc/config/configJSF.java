
package sghc.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;
//import static jakarta.faces.annotation.FacesConfig.Version.JSF_4_0;


@FacesConfig(
    //Esto activa el CDI para los beans.
    //version = JSF_4_0
)
@ApplicationScoped
public class configJSF {
    
}
