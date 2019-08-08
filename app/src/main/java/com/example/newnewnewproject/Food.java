package com.example.newnewnewproject;

public class Food {
    public static String typeFood;

    //to get food -> Food.AMERICAN[number-1] = {"name","url"}
    //Food.AMERICAN[number-1][0]


    public static String[][] AMERICAN = {{"Vegan Lentil Taco Salad ", "https://theprettybee.com/vegan-lentil-taco-salad/"},
            {"Sweat Potato Bean Burgers", "https://veganuary.com/recipes/sweet-potato-bean-burgers-with-maple-dijon-sauce/"},
            {"Vegan Chicken Nuggets", "https://veganuary.com/recipes/vegan-chicken-nuggets/"},
            {"Chickpea Flour Omelette", "https://www.veganricha.com/2012/08/chickpea-flour-omelette-with-spinach.html"},
            {"Veggie Dogs", "https://blog.fatfreevegan.com/2014/07/homemade-veggie-dogs.html"},
            {"Vegan Street TAcos", "https://www.theveganroad.com/recipes/vegan-street-tacos/"},
            {"Vegan Lasagna", "https://ohsheglows.com/2011/11/07/vegan-lasagna-with-basil-cashew-cheeze/"},
            {"Classic Baked Macaroni", "https://www.yummly.com/recipe/Classic-Baked-Macaroni-and-Cheese-1191584"},
            {"Pasta Carbonara", "https://www.rickiheller.com/2010/05/new-age-vegan-pasta-carbonara/"},
            {"Mushroom Ravioli", "http://veganyumminess.com/mushroom-ravioli-with-garlic-sun-dried-tomato-cream-sauce/"},
            {"Eggplant Bolognese", "http://thecornerkitchenblog.com/eggplant-bolognese/"},
            {"Vegan Nachos", "https://mywholefoodlife.com/2014/03/03/super-easy-vegan-nachos/"}};


    public static String[][] MEXICAN = {{"kale chip nachos", "https://minimalistbaker.com/kale-chip-nachos-30-minutes/"},
            {"ceviche", "https://www.veganmexicanfood.com/recipes/ceviche"},
            {"vegan tacos", "https://veganheaven.org/recipe/vegan-tacos-with-lentil-walnut-meat/"},
            {"vegan chiles en nogada ", "https://dorastable.com/vegan-chiles-en-nogada/"},
            {"mushroom quesadilla", "https://www.veganricha.com/2019/07/vegan-mushroom-quesadilla.html"},
            {"mexican bean burgers", "https://www.allrecipes.com/recipe/13963/mexican-bean-burgers/"},
            {"chipotle chili with avocado", "https://cookieandkate.com/butternut-squash-chipotle-chili-with-avocado/"},
            {"chili stuffed quesadillas", "https://www.vegetariantimes.com/recipes/chili-stuffed-enchiladas-with-roasted-mushroom-sauce"},
            {"lazy lentils", "https://veganuary.com/recipes/lazy-lentils/"},
            {"vegeterian mushroom quesadillas", "https://www.thespruceeats.com/vegetarian-mushroom-fajitas-recipe-3377114"},
            {"cauliflower tacos", "https://minimalistbaker.com/roasted-cauliflower-tacos-with-chipotle-romesco/"},
            {"mexican potatoes", "https://www.veganmexicanfood.com/recipes/mexican-potatoes"}};

    public static String [][] ITALIAN = {{"Spaghetti with Toassted Garlic Breadcrumbs and Blistered Cauliflower", "https://www.veganricha.com/2019/06/spaghetti-with-toasted-garlic-breadcrumbs-and-blistered-cauliflower.html"},
            {"Creamy Vegan Mushroom Lasagna", "https://www.thekitchn.com/creamy-vegan-mushroom-lasagna-250399"},
            {"Vegan Roast Veg Pesto Tofu Cauliflower Pizza", "https://veganuary.com/recipes/vegan-roast-veg-pesto-tofu-cauliflower-pizza/"},
            {"Over-baked Squash Gonocchi", "https://veganuary.com/recipes/vegan-roast-veg-pesto-tofu-cauliflower-pizza/"},
            {"Creamy Portobello Mushroom Arancini", "https://www.onegreenplanet.org/vegan-recipe/creamy-portobello-mushroom-arancini/"},
            {"Champignon Mushroom Risotto", "https://www.onegreenplanet.org/vegan-recipe/champignon-mushroom-risotto/"},
            {"Seitan Parmigiana", "https://www.onegreenplanet.org/vegan-recipe/seitan-parmigiana/"},
            {"Cristy King Trumpet Mushroom Calamari","https://www.onegreenplanet.org/vegan-recipe/crispy-king-trumpet-mushroom-calamari/"},
            {"Eggplant and Bell Pepper Caponata","https://www.onegreenplanet.org/vegan-recipe/eggplant-and-bell-pepper-caponata/"},
            {"Veggie Muffuletta","https://www.onegreenplanet.org/vegan-recipe/veggie-muffuletta/"},
            {"Fave e Cicorie","https://oldwayspt.org/recipes/fave-e-cicoria"},
            {"Spinach and Ricotta Vegan Stuffed Shells","https://simple-veganista.com/spinach-ricotta-stuffed-shells/#tasty-recipes-13854"}};

    public static String[][] FRENCH = {{"Ratatouille Recipe", "https://www.thespruceeats.com/french-vegetarian-recipes-1375858"},
            {"Cauliflower Gratin Recipe ", "//www.thespruceeats.com/french-vegetarian-recipes-1375858"},
            {"Tempeh and Mushroom Bourguignon Recipe  ", "https://www.onegreenplanet.org/vegan-recipe/tempeh-and-mushroom-bourguignon/"},
            {"Potato Leek Quiche", "ttps://www.onegreenplanet.org/vegan-recipe/potato-leek-quiche/"},
            {"Sun - Dried Tomato and Zucchini Tarts", "https://www.onegreenplanet.org/vegan-recipe/sun-dried-tomato-and-zucchini-tarts/"},
            {"Tomatoes Provencal ","https://www.onegreenplanet.org/vegan-recipe/tomatoes-provencal/"},
            {"Vegan Leek Quiche ","https://holycowvegan.net/vegan-leek-quiche/"},
            {"Vegan Savory Herb French Toast ","https://holycowvegan.net/vegan-savory-herb-french-toast/"},
            {"A tres vegan cassoulet ","https://holycowvegan.net/vegan-cassoulet"},
            {"Socca ( Farinata) - Chickpea Flour","https://simple-veganista.com/socca-farinata/"},
            {"Veggie Pan Bagnat( White Bean Nicoise Salad Sandwich ","https://simple-veganista.com/pan-bagnat-white-bean-nicoise-salad/"},
            {"Medterranean Tomato Tart ","https://veganuary.com/recipes/mediterranean-tomato-tart/"}};


    public static String[][] CHINESE = {{"Smoky tofu","https://www.connoisseurusveg.com/smoky-tofu-dumplings-with-sweet-chili-dipping-sauce/"},
            {"Shiitake mushroom","https://www.connoisseurusveg.com/vegan-bao-buns/"},
            {"Kung pao","https://www.veganricha.com/2015/01/kung-pao-lentils.html"},
            {"Sesame tofu ","https://www.veganricha.com/2017/03/sticky-ginger-sesame-tofu-veggies.html"},
            {"Panner ","https://www.veganricha.com/2016/10/chilli-tofu-indian-chilli-paneer-recipe.html"},
            {"Garlic noodles ","https://omnivorescookbook.com/garlic-noodles/"},
            {"Hot and sour soup","https://omnivorescookbook.com/vegetarian-hot-and-sour-soup/"},
            {"Nepali momos ","https://omnivorescookbook.com/nepali-momos-spinach-ricotta/"},
            {"Sesame noodles","https://omnivorescookbook.com/sesame-noodles/"},
            {"Mandarin orange ","https://veganuary.com/recipes/mandarin-orange-stirfry/"},
            {"Ginger chili ","https://veganuary.com/recipes/ginger-chilli-tofu-steaks/"},
            {"Tofu and brown rice ","https://www.veganricha.com/2017/01/tofu-brown-rice-noodles-hoisin-sauce.html"}};



    public static String[][] GREEK = {{"Anticuchos de pollo","https://www.commonbytes.org/?gclid=CjwKCAjw-ITqBRB7EiwAZ1c5U-EMxkX3QLdjboO--xqX2I9BJo4t9VfmLwkONFrXApUZLyFcstBOChoCmH4QAvD_BwE#!/recipes/65"},
            {"Island pizza-olive","https://www.olivetomato.com/authentic-greek-island-pizza-olive-oil-pizza-lathenia/"},
            {"Chickpea patties ","https://www.olivetomato.com/greek-chickpea-patties-with-thick-tomato-sauce-revithosoutzoukakia/"},
            {"Roasted zucchini","https://www.olivetomato.com/roasted-zucchini-with-garlic-and-tomato-a-recipe-from-crete/"},
            {"Vegan moussaka ","https://www.vegetariantimes.com/recipes/vegan-moussaka"},
            {"Jackfuit gyros","https://www.vegetariantimes.com/recipes/jackfruit-gyros"},
            {"Meatballs ","https://www.vegetariantimes.com/recipes/veg-greek-meatballs-with-feta-cheese"},
            {"Taleggio tartines","https://www.vegetariantimes.com/recipes/taleggio-tartines-with-grape-watercress-and-red-onion-salad"},
            {"Spring rolls","https://www.tasteofhome.com/recipes/spanakopita-spring-rolls/"},
            {"Tomato tart ","https://www.tasteofhome.com/recipes/terrific-tomato-tart/"},
            {"Balck bean burger ","http:///tastybite.com/recipes/tasty-bengal-black-bean-burger-2"},

            {"Stuffed peppers","http://tastybite.com/recipes/tasty-thai-lime-stuffed-peppers-2/"}};}












