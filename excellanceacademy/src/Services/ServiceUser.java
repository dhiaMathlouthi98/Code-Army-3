/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import com.codename1.ui.ComboBox;
import com.codename1.ui.Dialog;
import com.codename1.ui.TextField;
import com.codename1.ui.util.Resources;
import com.mycompany.utils.Statics;
import java.util.Map;
import java.util.Vector;



/**
 *
 * @author EMMI
 */
public class ServiceUser {
    //singleton
    public static ServiceUser  instance=null;
    
    public static boolean resulatok=true;
    String json;
    //initialisation connection request 
    private ConnectionRequest req;
      
    
    
    public static ServiceUser getInstance()
    { if(instance == null)
            instance = new ServiceUser();
            return instance;   
   }
    
    
     public ServiceUser()
    {
        req=new ConnectionRequest();
        
    }
     //Register
     
   public void signup(TextField prenom,TextField nom,TextField username,TextField mail,TextField mdp,ComboBox<String> role,Resources res) {
 
   
   String url = Statics.BASE_URL +"/User/news?nom="+nom.getText().toString()+"&prenom="+prenom.getText().toString()+"&username="+username.getText().toString()+"&mdp="+mdp.getText().toString()+
           
        "&email="+mail.getText().toString()+"&role"+role.getSelectedItem().toString();
   
    req.setUrl(url); 
    //control de saisi
    if (prenom.getText().equals(" ") && username.getText().equals(" ") && nom.getText().equals(" ") &&  mail.getText().equals(" ") && mdp.getText().equals(" ")){
      Dialog.show("Erreur","Veuillez remplir les champs","ok",null);
      
   }
    //execution mta3 url
   req.addResponseListener((e)-> {
       //njibou data eli 7atithom fel form
       byte[]data =(byte[]) e.getMetaData();//n7othom fi meta data ya3ni ne5ou id ta3 kol textfield
   String responseData = new String(data);//ne5ou content
   
   System.out.println("data ===>"+responseData);
   
   }
   );
   //ba3d el execution nestanew reponse ta3 server
   NetworkManager.getInstance().addToQueueAndWait(req);
   
   
   }
   
   //login
    public void signin(TextField username,TextField mdp,Resources rs){
    
     String url = Statics.BASE_URL +"/?email="+username.getText().toString()+"&mdp="+mdp.getText().toString();
    req = new ConnectionRequest(url,false); // false url matba3thetech lel server
     req.setUrl(url);
    req.addResponseListener((e)->{
        
        JSONParser j = new JSONParser();
        String json = new String(req.getResponseData()) + "";
        
        try{
        if(json.equals("failed")){
        Dialog.show("Echec d'authentification","User ou Mot de passe éronné","ok",null);
        
        }
        else{
            System.out.println("data =="+json);
            Map<String,Object> user = j.parseJSON(new CharArrayReader(json.toCharArray()));
            
            // if(user.size()>0)//fama user
               //new ListReclamationForm(rs).show;
        }
        } catch(Exception ex){ ex.printStackTrace();}
  
    }  );
    //ba3d el execution nestanew reponse ta3 server
   NetworkManager.getInstance().addToQueueAndWait(req);
   
    }

   /**
    * 
    * 
    * @param mail
    * @param rs
    * @return 
    */
    public String getPasswordByEmail(String mail, Resources rs){
         
        
        String url = Statics.BASE_URL +"/getPasswordByemail?mail="+mail;
        System.out.println("mail");
        System.out.println(mail);
        
        req = new ConnectionRequest(url,false); // false url matba3thetech lel server
     req.setUrl(url);
    req.addResponseListener((e)->{
        System.out.println("444444");
        JSONParser j = new JSONParser();
         json = new String(req.getResponseData()) + "";
                    System.out.println("data =="+json);

        try{
            System.out.println("data =="+json);
           Map<String,Object> mdp = j.parseJSON(new CharArrayReader(json.toCharArray()));

            
        }catch(Exception ex){
            System.out.println("data ==");
            ex.printStackTrace();
        }
        });
    NetworkManager.getInstance().addToQueueAndWait(req);
    System.out.println("33333");
   return json;
   
    }





}



    
    
      
      
      
      


   
   
  
