
package sghc.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;


@FacesConfig(
    //Esto activa el CDI para los beans.
    version = JSF_2_3
)
@ApplicationScoped
public class configJSF {
    
}
