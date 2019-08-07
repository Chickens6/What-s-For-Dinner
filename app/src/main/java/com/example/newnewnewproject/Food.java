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
            {"Tomatoes Provencal ", "https://www.onegreenplanet.org/vegan-recipe/tomatoes-provencal/"},
            {"Vegan Leek Quiche ", "https://holycowvegan.net/vegan-leek-quiche/"},
            {"Vegan Savory Herb French Toast ", "https://holycowvegan.net/vegan-savory-herb-french-toast/"},
            {"A tres vegan cassoulet ", "https://holycowvegan.net/vegan-cassoulet"},
            {"Socca ( Farinata) - Chickpea Flour", "https://simple-veganista.com/socca-farinata/"},
            {"Veggie Pan Bagnat( White Bean Nicoise Salad Sandwich ", "https://simple-veganista.com/pan-bagnat-white-bean-nicoise-salad/"},
            {"Medterranean Tomato Tart ", "https://veganuary.com/recipes/mediterranean-tomato-tart/"}};

}



