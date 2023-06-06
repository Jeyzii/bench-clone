package com.example.bench.bench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.Arrays;

public class Items extends AppCompatActivity {



    GridView gv;

    String[] itemname = {
            "Shirt",
            "Short",
            "Sandals",
            "Skirt",
            "Shoes",
            "Belt",
            "Pants",
            "UnderWear",
            "Jacket",
    };
    //belts
    String[] belts = {"Leather Belt", "Leather Belt", "Leather Belt", "Canvas Belt", "Canvas Belt", "Canvas Belt", "Canvas Belt", "Ladies' Belt",
    };
    String[] beltss = {"130 Php", "130 Php", "130 Php", "100 Php", "100 Php", "100 Php", "100 Php", "100 Php",
    };
    String[] beltsss = {"Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ",
    };
    String [] beltssss = {"Material: Leather \nColor: Plain Black \nAvailable Length: 26-40 Inches \nDesign: Plain",
            "Material: Leather \nColor: Plain Black \nAvailable Length: 26-40 Inches \nDesign: Textured ",
            "Material: Leather \nColor: Plain Black \nAvailable Length: 26-40 Inches \nDesign: Holes ",
            "Material: Canvas \nColor: Plain Black \nAvailable Length: 26-40 Inches \nDesign: Big Holes ",
            "Material: Canvas \nColor: Plain Gold \nAvailable Length: 26-40 Inches \nDesign: Big Holes ",
            "Material: Canvas \nColor: Plain Camo Green \nAvailable Length: 26-40 Inches \nDesign: Big Holes ",
            "Material: Canvas \nColor: Black and Silver \nAvailable Length: 26-40 Inches \nDesign: Big Holes ",
            "Material: Canvas \nColor: Gray \nAvailable Length: 26-40 Inches \nDesign: Big Holes ",
    };

    //shirts
    String[] shirts = {"Checkered Short Sleeve Shirt", "Full Print Short Sleeve Shirt with Pocket", "Full Print Short Sleeve Shirt with Pocket", "Full Print Denim Short Sleeve Shirt with Pocket", "Full Print Denim Short Sleeve Shirt with Pocket", "Full Print Short Sleeve Shirt with Pocket", "Full Print Short Sleeve Shirt with Pocket", "Long Sleeve Shirt", "Short Sleeve Shirt", "Short Sleeve Shirt", "Short Sleeve Shirt",
            "Striped Polo Shirt", "Striped Polo Shirt", "Striped Polo Shirt", "Statement Tee", "Statement Tee", "Textured Tee", "Textured Tee", "Textured Tee", "Printed Tee", "Printed Tee", "Polo Shirt With Emblem",
    };
    String[] shirtss = {"350 Php", "350 Php", "350 Php", "350 Php", "350 Php", "350 Php", "350 Php", "450 Php", "400 Php", "400 Php",
            "400 Php", "300 Php", "300 Php", "300 Php", "250 Php", "250 Php", "250 Php", "250 Php", "250 Php", "250 Php", "250 Php", "250 Php",
    };
    String[] shirtsss = {"Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ","Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ",
            "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ",
    };
    String[] shirtssss = {"Material: Flannel \nColor: Maroon \nAvailable Sizes: XS - XXXL \nDesign: Checkered ",
            "Material: Poplin \nColor: Sky Blue \nAvailable Sizes: XS - XXXL \nDesign: Dotted ",
            "Material: Poplin \nColor: White \nAvailable Sizes: XS - XXXL \nDesign: Plain ",
            "Material: Denim \nColor: Navy Blue\nAvailable Sizes: XS - XXXL \nDesign: Plain ",
            "Material: Denim \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Plain ",
            "Material: Poplin \nColor: Blue\nAvailable Sizes: XS - XXXL \nDesign: Plain ",
            "Material: Poplin \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Poplin \nColor: Sky Blue \nAvailable Sizes: XS - XXXL \nDesign: Blue Mid ",
            "Material: Broad Cloth \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: Two Toned ",
            "Material: Broad Cloth \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: Two Toned ",
            "Material: Broad Cloth \nColor: Blue/White \nAvailable Sizes: XS - XXXL \nDesign: Two Toned ",
            "Material: Broad Cloth \nColor: Maroon/Black/Gray \nAvailable Sizes: XS - XXXL \nDesign: Striped ",
            "Material: Broad Cloth \nColor: Blue/Yellow/White \nAvailable Sizes: XS - XXXL \nDesign: Striped ",
            "Material: Broad Cloth \nColor: White/Silver/Gray \nAvailable Sizes: XS - XXXL \nDesign: Striped ",
            "Material: Cotton \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Statement ",
            "Material: Cotton \nColor: White \nAvailable Sizes: XS - XXXL \nDesign: Statement ",
            "Material: Cotton \nColor: Orange \nAvailable Sizes: XS - XXXL \nDesign: Textured ",
            "Material: Cotton \nColor: Green \nAvailable Sizes: XS - XXXL \nDesign: Textured ",
            "Material: Cotton \nColor: Red \nAvailable Sizes: XS - XXXL \nDesign: Textured ",
            "Material: Cotton \nColor: White \nAvailable Sizes: XS - XXXL \nDesign: Printed ",
            "Material: Cotton \nColor: Yellow \nAvailable Sizes: XS - XXXL \nDesign: Printed",
            "Material: Cotton \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Emblem",
    };

   //jackets
    String[] jackets = {"Fleece Vest with Hood", "Fleece Vest with Hood", "Embroidered Bomber Jacket", "Bomber Jacket with Patches", "Hooded Fleece Vest", "Fleece Hoodie", "Fleece Hoodie", "Fleece Hoodie", "Fleece Hoodie", "Bomber Jacket", "Bomber Jacket","Hooded Fleece Vest","Fleece Hoodie","Fleece Hoodie","Fleece Hoodie","Rain Jacket","Full Print Jacket","Two Tone Denim Jacket","Ribbed Cuff Denim Jacket",
    };
    String[] jacketss = {"250 Php", "250 Php", "550 Php", "550 Php", "200 Php", "350 Php", "350 Php", "350 Php", "350 Php",
            "300 Php", "300 Php","200 Php","350 Php","350 Php","350 Php","500 Php","500 Php","600 Php","600 Php",
    };
    String[] jacketsss = {"Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ","Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ",
            "Details: ", "Details: ", "Details: ",
    };
    String[] jacketssss = {"Material: Fleece \nColor: Navy Blue \nAvailable Sizes: XS - XXXL \nDesign: No sleeves with hood",
            "Material: Fleece \nColor: Gray \nAvailable Sizes: XS - XXXL \nDesign: No sleeves with hood",
            "Material: Silk \nColor: Black/Blue \nAvailable Sizes: XS - XXXL \nDesign: Embroidered",
            "Material: Silk \nColor: Brown \nAvailable Sizes: XS - XXXL \nDesign: Bomber with Patches",
            "Material: Fleece \nColor: Light Gray \nAvailable Sizes: XS - XXXL \nDesign: With hood",
            "Material: Fleece\nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: With hood",
            "Material: Fleece \nColor: Brown \nAvailable Sizes: XS - XXXL \nDesign: With hood",
            "Material: Fleece \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: With hood",
            "Material: Fleece \nColor: Red \nAvailable Sizes: XS - XXXL \nDesign: With hood",
            "Material: Silk \nColor: Green \nAvailable Sizes: XS - XXXL \nDesign: Bomber",
            "Material: Silk \nColor: Maroon \nAvailable Sizes: XS - XXXL \nDesign: Bomber" ,
            "Material: Fleece \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Hooded vest",
            "Material: Fleece \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Hoodie",
            "Material: Fleece \nColor: Dark Gray \nAvailable Sizes: XS - XXXL \nDesign: Hoodie",
            "Material: Fleece \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: Hoodie",
            "Material: WaterProof \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Rain",
            "Material: Fleece \nColor: Light Blue \nAvailable Sizes: XS - XXXL \nDesign: Full print",
            "Material: Denim \nColor: Blue/Gray \nAvailable Sizes: XS - XXXL \nDesign: Two toned",
            "Material: Denim \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: Ribbed cuff",
    };

    //pants
    String[] pantss = {"Drawstring Joggers", "Twills Pants", "Slim Fit Twills Pants", "Slim Fit Jeans", "Poplin Joggers", "Slim Fit Twills Pants", "Twills Pants", "Slim Fit Twills Pants", "Slim Fit Twills Pants", "Twills Pants", "Twills Pants","Twills Pants","Twills Pants"
    };
    String[] pantsss = {"550 Php", "350 Php", "450 Php", "600 Php", "500 Php", "450 Php", "350 Php", "450 Php", "450 Php", "350 Php", "350 Php","350 Php","350 Php"
    };
    String[] pantssss = {"Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ","Details: ", "Details: ", "Details: ", "Details: ", "Details: ",
    };
    String[] pantsssss = {"Material: Cuffed \nColor: Gray \nAvailable Sizes: XS - XXXL \nDesign: Drawstring",
            "Material: Twills \nColor: Khaki \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Twills \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Slim Fit",
            "Material: Twills \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: Slim Fit",
            "Material: Poplin \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Twills \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Slim Fit",
            "Material: Twills \nColor: Maroon \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Twills \nColor: Brown \nAvailable Sizes: XS - XXXL \nDesign: Slim Fit",
            "Material: Twills \nColor: Brown \nAvailable Sizes: XS - XXXL \nDesign: Slim Fit",
            "Material: Twills \nColor: Light Brown \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Twills \nColor: Light Gray \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Twills \nColor: Gray \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Twills \nColor: Gray \nAvailable Sizes: XS - XXXL \nDesign: Plain",
    };


    //shorts
    String[] shortsss = {"Twill Shorts", "Tropical Print Jogging Shorts", "Jogging Shorts", "Ripstop Walking Shorts",
            "Tropical Print Fleece Jogging Shorts", "denim Shorts",
            "Tropical Print Jogging Shorts", "Twill Walking Shorts", "Twill Walking Shorts", "Twill Walking Shorts",
            "Twill Shorts",
    };
    String[] shortssss = {"250 Php", "450 Php", "300 Php", "300 Php", "450 Php", "500 Php", "450 Php", "250 Php", "250 Php", "250 Php", "250 Php",
    };
    String[] shortsssss = {"Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ","Details: ", "Details: ", "Details: ",
    };
    String[] shortssssss = {"Material: Twills \nColor: Khaki \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Cuffed \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: Print",
            "Material: Cuffed \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Ripstop \nColor: Brown \nAvailable Sizes: XS - XXXL \nDesign: Camo",
            "Material: Cuffed \nColor: Black/White \nAvailable Sizes: XS - XXXL \nDesign: Print",
            "Material: Denim \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Cuffed \nColor: Red \nAvailable Sizes: XS - XXXL \nDesign: Print",
            "Material: Twills \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Twills \nColor: Light Blue \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Twills \nColor: Light Gray \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Twills \nColor: Khaki \nAvailable Sizes: XS - XXXL \nDesign: Plain",
    };

    //sandals
    String[] sandalss = {"Printed Slippers", "Printed Slippers", "Printed Slippers", "Printed Slippers", "Printed Slippers", "Printed Slippers", "Printed Slippers", "Printed Slippers", "Printed Rubber Slippers", "Printed Rubber Slippers", "Basic Rubber Sleepers",
    };
    String[] sandalsss = {"150 Php", "150 Php", "150 Php", "150 Php", "150 Php", "150 Php", "150 Php", "150 Php", "150 Php", "150 Php", "100 Php",
    };
    String[] sandalssss = {"Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ","Details: ", "Details: ","Details: ",
    };
    String[] sandalsssss = {"Material: Rubber \nAvailable Sizes: Kids, Womans, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Basic",
    };

    //skirts
    String[] skirts = {"Plated Mid Length Skirt", "Striped Mini Skirt", "Denim Pencil Skirt", "Full Print Frill Hem Skirt", "Full Print Calf Length Skirt", "Full Print Calf Length Skirt", "Mid Length Circle Skirt", "Mid Length Circle Skirt", "Mini Skirt", "Layered Pencil Skirt", "Eyelet Calf Length Skirt",
    };
    String[] skirtss = {"500 Php", "350 Php", "450 Php", "600 Php", "600 Php", "600 Php", "400 Php", "400 Php", "350 Php", "350 Php", "600 Php",
    };
    String[] skirtsss = {"Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ","Details: ", "Details: ","Details: ",
    };
    String[] skirtssss = {"Material: Polyester \nColor: Pink \nAvailable Sizes: XS - XXXL \nDesign: Plated mid length",
            "Material: Denim \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: Striped",
            "Material: Denim \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Polyester \nColor: White \nAvailable Sizes: XS - XXXL \nDesign: Full Print Calf Length",
            "Material: Polyester \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Full Print Calf Length",
            "Material: Polyester \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Full Print Calf Length",
            "Material: Polyester \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Mid Lenght Circle",
            "Material: Polyester \nColor: Gray \nAvailable Sizes: XS - XXXL \nDesign: Mid Lenght Circle",
            "Material: Cotton \nColor: Light Blue \nAvailable Sizes: XS - XXXL \nDesign: Mini",
            "Material: Polyester\nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Layered",
            "Material: Polyester \nColor: White \nAvailable Sizes: XS - XXXL \nDesign: Eyelet Calf Length",
    };

    //underwear
    String[] underWear = {"3-in-1 Pack Hipster Brief", "3-in-1 Pack Hipster Brief", "5-in-1 Pack Bikini Brief", "2-in-1 Mid-Rise Hipster Panty Pack", "5-in-1 Low Rise Bikini Pack", "2-in-1 Bikini Pack", "Low Rise Hipster", "Low Rise Hipster", "Sexy Low Rise Hipster", "Boxer Brief", "Boxer Brief",
    };
    String[] underWears = {"350 Php", "350 Php", "500 Php", "350 Php", "500 Php", "350 Php", "250 Php", "250 Php", "350 Php", "150 Php", "150 Php",
    };
    String[] underWearss = {"Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ","Details: ", "Details: ","Details: ",
    };
    String[] underWearsss = {"Material: Polyester \nColor: White/Gray/Black \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Polyester \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Polyester \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Plain",
            "Material: Polyester \nColor: Black\nAvailable Sizes: XS - XXXL \nDesign: Mid Rise Hipster",
            "Material: Polyester \nColor: Assorted \nAvailable Sizes: XS - XXXL \nDesign: Low rise Bikini",
            "Material: Polyester \nColor: Purple/Violet \nAvailable Sizes: XS - XXXL \nDesign: Bikini",
            "Material: Polyester \nColor: Pink \nAvailable Sizes: XS - XXXL \nDesign: Low rise hipster",
            "Material: Polyester \nColor: Pink \nAvailable Sizes: XS - XXXL \nDesign: Low rise hipster",
            "Material: Polyester \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Sexy Low rise hipster",
            "Material: Twills \nColor: Blue \nAvailable Sizes: XS - XXXL \nDesign: Boxer",
            "Material: Twills \nColor: Black \nAvailable Sizes: XS - XXXL \nDesign: Boxer",
    };

    //shoes
    String[] shoess = {"Canvas Slip Ons", "Lace Up Sneakers", "Slip ons", "Casual Shoes", "Ladies' Slip Ons", "Tropical Print Velcro Sneakers", "Side Lace Sneakers", "Star Print Slip Ons", "High Cut Canvas Trainers ", "Silk Trainers", "Suede Trainers",
    };
    String[] shoesss = {"999 Php", "1200 Php", "999 Php", "1200 Php", "999 Php", "999 Php", "1500 Php", "1500 Php", "1500 Php ", "1500 Php", "1500 Php",
    };
    String[] shoessss = {"Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ", "Details: ","Details: ", "Details: ","Details: ",
    };
    String[] shoesssss = {"Material: Canvas \nColor: Black \nAvailable Sizes:  Kids, Womens, Mens US Size 5-16 \nDesign: Slip-ons",
            "Material: Denim \nColor: Black \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Lace up",
            "Material: Denim \nColor: Black \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Slip ons",
            "Material: Denim \nColor: Black \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Casual",
            "Material: Suede \nColor: Black \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Checkered",
            "Material: Rubber \nColor: Black \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Printed",
            "Material: Rubber \nColor: Black \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Side Lace",
            "Material: Leather \nColor: Black \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Star Print",
            "Material: Canvas \nColor: Gray \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: High Cut",
            "Material: Silk \nColor: Pink \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Plain",
            "Material: Suede \nColor: Black \nAvailable Sizes: Kids, Womens, Mens US Size 5-16 \nDesign: Star",
    };


    Integer[] imageID = {R.drawable.shirt, R.drawable.shortss, R.drawable.sandals, R.drawable.skirt, R.drawable.shoes, R.drawable.belt,
            R.drawable.pants, R.drawable.tie, R.drawable.underwear, R.drawable.jacket};
    Integer[] belt = {R.drawable.belt1, R.drawable.belt2, R.drawable.belt3, R.drawable.belt4, R.drawable.belt5, R.drawable.belt6, R.drawable.belt7, R.drawable.belt8,
    };
    Integer [] shirt ={R.drawable.shirt1, R.drawable.shirt2, R.drawable.shirt3, R.drawable.shirt4, R.drawable.shirt5, R.drawable.shirt6, R.drawable.shirt7, R.drawable.shirt8,
            R.drawable.shirt9, R.drawable.shirt10, R.drawable.shirt11,R.drawable.tshirt1, R.drawable.tshirt2, R.drawable.tshirt3, R.drawable.tshirt4, R.drawable.tshirt5, R.drawable.tshirt6, R.drawable.tshirt7, R.drawable.tshirt8,
            R.drawable.tshirt9, R.drawable.tshirt10, R.drawable.tshirt11};
    Integer [] jacket ={R.drawable.jacket1,R.drawable.jacket2,R.drawable.jacket3,R.drawable.jacket4,R.drawable.jacket5,R.drawable.jacket6,R.drawable.jacket7,
            R.drawable.jacket8,R.drawable.jacket9,R.drawable.jacket10,R.drawable.jacket11,R.drawable.jacket12,R.drawable.jacket14,R.drawable.jacket15,R.drawable.jacket16,R.drawable.jacket17,R.drawable.jacket18,R.drawable.jacket19,R.drawable.jacket20,};
    Integer [] pants ={R.drawable.pants1,R.drawable.pants2,R.drawable.pants3,R.drawable.pants4,R.drawable.pants5,R.drawable.pants6,R.drawable.pants7,
            R.drawable.pants8,R.drawable.pants9,R.drawable.pants10,R.drawable.pants11,R.drawable.pants12,R.drawable.pants13};
    Integer [] shortss ={R.drawable.short1, R.drawable.short2, R.drawable.short3, R.drawable.short4, R.drawable.short5, R.drawable.short6, R.drawable.short7, R.drawable.short8,
            R.drawable.short9, R.drawable.short10, R.drawable.short11,R.drawable.short12};
    Integer [] sandals ={R.drawable.sandals1, R.drawable.sandals2, R.drawable.sandals3, R.drawable.sandals4, R.drawable.sandals5, R.drawable.sandals6, R.drawable.sandals7, R.drawable.sandals8,
            R.drawable.sandals9, R.drawable.sandals10, R.drawable.sandals11};
    Integer [] skirt ={R.drawable.skirt1,R.drawable.skirt2,R.drawable.skirt3,R.drawable.skirt4,R.drawable.skirt5,R.drawable.skirt6,R.drawable.skirt7,
            R.drawable.skirt8,R.drawable.skirt9,R.drawable.skirt10,R.drawable.skirt11};
    Integer [] underwear ={R.drawable.underwear1,R.drawable.underwear2,R.drawable.underwear3,R.drawable.underwear4,R.drawable.underwear5,R.drawable.underwear6,R.drawable.underwear7,
            R.drawable.underwear8,R.drawable.underwear9,R.drawable.underwear10,R.drawable.underwear11};
    Integer [] shoes ={R.drawable.shoes1,R.drawable.shoes2,R.drawable.shoes3,R.drawable.shoes4,R.drawable.shoes5,R.drawable.shoes6,R.drawable.shoes7,
            R.drawable.shoes8,R.drawable.shoes9,R.drawable.shoes10,R.drawable.shoes11};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        gv = (GridView) findViewById(R.id.grid);

        Arrays.sort(itemname);
        Arrays.sort(imageID);

        //Intent i = getIntent();
        //String itemList = i.getStringExtra("ItemList");

        HomeActivity home = new HomeActivity();
        final String itemList = home.item;


        if(itemList.equals("Belt")){
            CustomGrid adapter = new CustomGrid(Items.this, belts, belt);
            gv.setAdapter(adapter);
        }
        if(itemList.equals("Skirt")){
            CustomGrid adapter = new CustomGrid(Items.this, skirts, skirt);
            gv.setAdapter(adapter);
        }
        if(itemList.equals("Short")){
            CustomGrid adapter = new CustomGrid(Items.this, shortsss, shortss);
            gv.setAdapter(adapter);
        }
        if(itemList.equals("Sandals")){
            CustomGrid adapter = new CustomGrid(Items.this, sandalss, sandals);
            gv.setAdapter(adapter);
        }
        if(itemList.equals("Pants")){
            CustomGrid adapter = new CustomGrid(Items.this, pantss, pants);
            gv.setAdapter(adapter);
        }
        if(itemList.equals("Jacket")){
            CustomGrid adapter = new CustomGrid(Items.this, jackets, jacket);
            gv.setAdapter(adapter);
        }
        if(itemList.equals("UnderWear")){
            CustomGrid adapter = new CustomGrid(Items.this, underWear, underwear);
            gv.setAdapter(adapter);
        }
        if(itemList.equals("Shoes")){
            CustomGrid adapter = new CustomGrid(Items.this, shoess, shoes);
            gv.setAdapter(adapter);
        }
        if(itemList.equals("Shirt")){
            CustomGrid adapter = new CustomGrid(Items.this, shirts, shirt);
            gv.setAdapter(adapter);
        }

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itemChosen = (String) adapterView.getItemAtPosition(i);
                Intent intent = new Intent(Items.this, ItemDetails.class);
                intent.putExtra("Itemname", itemChosen);


                if(itemList.equals("Belt")){
                    intent.putExtra("itemImage", belt[i]);
                    intent.putExtra("itemPrice", beltss[i]);
                    intent.putExtra("itemDetails", beltsss[i]);
                    intent.putExtra("itemInfos1", beltssss[i]);

                }
                if(itemList.equals("Shirt")){
                    intent.putExtra("itemImage", shirt[i]);
                    intent.putExtra("itemPrice", shirtss[i]);
                    intent.putExtra("itemDetails", shirtsss[i]);
                    intent.putExtra("itemInfos1", shirtssss[i]);
                }
                if(itemList.equals("Skirt")){
                    intent.putExtra("itemImage", skirt[i]);
                    intent.putExtra("itemPrice", skirtss[i]);
                    intent.putExtra("itemDetails", skirtsss[i]);
                    intent.putExtra("itemInfos1", skirtssss[i]);
                }
                if(itemList.equals("Short")){
                    intent.putExtra("itemImage", shortss[i]);
                    intent.putExtra("itemPrice", shortssss[i]);
                    intent.putExtra("itemDetails", shortsssss[i]);
                    intent.putExtra("itemInfos1", shortssssss[i]);
                }
                if(itemList.equals("Sandals")){
                    intent.putExtra("itemImage", sandals[i]);
                    intent.putExtra("itemPrice", sandalsss[i]);
                    intent.putExtra("itemDetails", sandalssss[i]);
                    intent.putExtra("itemInfos1", sandalsssss[i]);
                }
                if(itemList.equals("Pants")){
                    intent.putExtra("itemImage", pants[i]);
                    intent.putExtra("itemPrice", pantsss[i]);
                    intent.putExtra("itemDetails", pantssss[i]);
                    intent.putExtra("itemInfos1", pantsssss[i]);
                }
                if(itemList.equals("Jacket")){
                    intent.putExtra("itemImage", jacket[i]);
                    intent.putExtra("itemPrice", jacketss[i]);
                    intent.putExtra("itemDetails", jacketsss[i]);
                    intent.putExtra("itemInfos1", jacketssss[i]);
                }
                if(itemList.equals("UnderWear")){
                    intent.putExtra("itemImage", underwear[i]);
                    intent.putExtra("itemPrice", underWears[i]);
                    intent.putExtra("itemDetails", underWearss[i]);
                    intent.putExtra("itemInfos1", underWearsss[i]);
                }
                if(itemList.equals("Shoes")){
                    intent.putExtra("itemImage", shoes[i]);
                    intent.putExtra("itemPrice", shoesss[i]);
                    intent.putExtra("itemDetails", shoessss[i]);
                    intent.putExtra("itemInfos1", shoesssss[i]);
                }


                startActivity(intent);
            }

        });

    }

    @Override
        public boolean onOptionsItemSelected(MenuItem item){
            Intent myIntent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivityForResult(myIntent, 0);
            finish();
            return true;
        }

    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(getApplicationContext(), HomeActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
    }
}
