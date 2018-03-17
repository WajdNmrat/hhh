package com.example.nmrat.wajdnmrat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person{} Persons = new Person {3};
        Persons{0} = new Doctor ;
        Persons {0}.setId(1);
        Persons {0}.setName('abu elabed');
        Persons {0}.setAddress('al7ara');
        Persons {0}.setEmail('abu ealbed@gmail.com');
        Persons {0}.setPhone ('0548594056');
        ((Doctor)persons{0}).setExperience(5.0);
        ((Doctor)persons{0}).setSallary(35000.0);
        ((Doctor)persons{0}).setSpecialization('surgical');
        Persons {1} = new HeadsofDepartments() ;
        Persons {1}.setId(1);
        Persons {1}.setName('abu elabed');
        Persons {1}.setAddress('al7ara');
        Persons {1}.setEmail('abu ealbed@gmail.com');
        Persons {1}.setPhone ('0548594056');
        ((new HeadsofDepartments)persons{1}).setspecializatin('Doctor');
        ((new HeadsofDepartments)persons{1}).setcertificates('Doctor');
        ((new HeadsofDepartments)persons{1}).setyears_experience('5');
        Persons {2} = new Nurses ;
        Persons {2}.setName('am elabed');
        Persons {2}.setAddress('al7ara');
        Persons {2}.setEmail('am ealbed@gmail.com');
        Persons {2}.setPhone ('0548594051');
        ((Nurses)persons{2}).set specializatin();
        ((Nurses)persons{2}).setexperience(10);
        ((Nurses)persons{2}).setsallary(10000.00);
        for (int i= 0; i<3; i++)
            {
                persons{i}.tostring();

        }
    }
}
