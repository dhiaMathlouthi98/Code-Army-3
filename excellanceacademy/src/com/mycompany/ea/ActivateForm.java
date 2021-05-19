/*
 * Copyright (c) 2016, Codename One
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, 
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions 
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE 
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */

package com.mycompany.ea;

import com.codename1.components.FloatingHint;
import com.codename1.components.InfiniteProgress;
import com.codename1.components.SpanLabel;
import com.codename1.messaging.Message;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;
import Services.ServiceUser;
import com.sun.mail.smtp.SMTPTransport;
import java.util.Date;
import javax.mail.Message.RecipientType;
import javax.mail.Session; 

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



/**
 * Account activation UI
 *
 * @author Shai Almog
 */
public class ActivateForm extends BaseForm {
    TextField mail;

    public ActivateForm(Resources res) {
     /*   super(new BorderLayout());
        Toolbar tb = new Toolbar(true);
        setToolbar(tb);
        tb.setUIID("IMGLogin");
        getTitleArea().setUIID("Container");
        Form previous = Display.getInstance().getCurrent();
        tb.setBackCommand("", e -> previous.showBack());
        setUIID("Activate");
        
        add(BorderLayout.NORTH, 
                BoxLayout.encloseY(
                        new Label(res.getImage("39-512.png"), "LogoLabel"),
                        new Label("Awsome Thanks!", "LogoLabel")
                )
        );
        
     mail = new TextField("","saisir votre email",20,TextField.ANY) ;
      mail.setSingleLineTextArea(false);
      Button valider = new Button("Valider");
      Label haveAnAcount = new Label("Retour se connecter?");
      Button signIn = new Button("Renouveler votre mot de passa");
      signIn.addActionListener( e->previous.showBack()); //yarja3 lel window eli 9bal
      signIn.setUIID("CenterLink");
      
      Container content = BoxLayout.encloseY(

              new FloatingHint(mail),
              (createLineSeparator()),
              valider,
              FlowLayout.encloseCenter(haveAnAcount),
              signIn
      );
      content.setScrollableY(true);
      add(BorderLayout.CENTER,content);
      valider.requestFocus();
      valider.addActionListener(e -> {
          InfiniteProgress ip = new InfiniteProgress();
          final Dialog ipDialog = ip.showInfiniteBlocking();
          
          
          //api send mail
          sendMail(res);
          ipDialog.dispose();
          Dialog.show("Mot de passe","Nous avons envoye le mot de passe a votre mail" , new Command("OK"));
          new SignInForm(res).show();
          refreshTheme();
          
          
      
      });

      
    }
    
    //sendMail
    public void sendMail (Resources res){
        try{
        
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtps.host", "smtp.gmail.com");
        props.put("mail.smtps.auth", "true");
        
        
        Session session = Session.getInstance(props, null);
                 
       MimeMessage msg = new  MimeMessage (session) ;
       msg.setFrom (new InternetAddress("Reintialisation mot de passe <monEmail@domaine.com>"));
       
      
      msg.setRecipients(RecipientType.TO,mail.getText().toString());

      msg.setSubject("Application nom  : Confirmation du");
       msg.setSentDate(new Date(System.currentTimeMillis()));
        
      String mp = ServiceUser.getInstance().getPasswordByEmail(mail.getText().toString() , res);
       String txt = "Bienvenue sur ilearn: Tapez ce mot de passe : "+mp+"dans le champ requis ";
            System.out.println("mp");
            System.out.println(mp);
        msg.setText(txt);
        SMTPTransport st = (SMTPTransport)session.getTransport("smtps") ;
        
       st.connect("smtp.gmail.com",465,"excellenceacademy878@gmail.com","freefire1234");
       st.sendMessage(msg, msg.getAllRecipients());
       System.out.println("server response:"+st.getLastServerResponse());
       
       
        }catch(Exception e){
            e.printStackTrace();
        }
           
        */
    }
    
    
}
