package Question98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapChallenge {
    public static void main(String[] args) {
        Map <String,String> countryBox = new HashMap<>();
        countryBox.put("Afghanistan", "Kabul");
        countryBox.put("Albania", "Tirana");
        countryBox.put("Algeria", "Algiers");
        countryBox.put("Andorra", "Andorra la Vella");
        countryBox.put("Angola", "Luanda");
        countryBox.put("Antigua and Barbuda", "Saint John’s");
        countryBox.put("Argentina", "Buenos Aires");
        countryBox.put("Armenia", "Yerevan");
        countryBox.put("Australia", "Canberra");
        countryBox.put("Austria", "Vienna");
        countryBox.put("Azerbaijan", "Baku");
        countryBox.put("Bahamas", "Nassau");
        countryBox.put("Bahrain", "Manama");
        countryBox.put("Bangladesh", "Dhaka");
        countryBox.put("Barbados", "Bridgetown");
        countryBox.put("Belarus", "Minsk");
        countryBox.put("Belgium", "Brussels");
        countryBox.put("Belize", "Belmopan");
        countryBox.put("Benin", "Porto-Novo");
        countryBox.put("Bhutan", "Thimphu");
        countryBox.put("Bolivia", "Sucre"); // (constitutional), La Paz (seat of government)
        countryBox.put("Bosnia and Herzegovina", "Sarajevo");
        countryBox.put("Botswana", "Gaborone");
        countryBox.put("Brazil", "Brasília");
        countryBox.put("Brunei", "Bandar Seri Begawan");
        countryBox.put("Bulgaria", "Sofia");
        countryBox.put("Burkina Faso", "Ouagadougou");
        countryBox.put("Burundi", "Gitega"); // administrative change from Bujumbura
        countryBox.put("Cabo Verde", "Praia");
        countryBox.put("Cambodia", "Phnom Penh");
        countryBox.put("Cameroon", "Yaoundé");
        countryBox.put("Canada", "Ottawa");
        countryBox.put("Central African Republic", "Bangui");
        countryBox.put("Chad", "N’Djamena");
        countryBox.put("Chile", "Santiago");
        countryBox.put("China", "Beijing");
        countryBox.put("Colombia", "Bogotá");
        countryBox.put("Comoros", "Moroni");
        countryBox.put("Congo", "Kinshasa");
        countryBox.put("Congo (Republic)", "Brazzaville");
        countryBox.put("Costa Rica", "San José");
        countryBox.put("Croatia", "Zagreb");
        countryBox.put("Cuba", "Havana");
        countryBox.put("Cyprus", "Nicosia");
        countryBox.put("Czech Republic", "Prague");
        countryBox.put("Denmark", "Copenhagen");
        countryBox.put("Djibouti", "Djibouti");
        countryBox.put("Dominica", "Roseau");
        countryBox.put("Dominican Republic", "Santo Domingo");
        countryBox.put("Ecuador", "Quito");
        countryBox.put("Egypt", "Cairo");
        countryBox.put("El Salvador", "San Salvador");
        countryBox.put("Equatorial Guinea", "Malabo");
        countryBox.put("Eritrea", "Asmara");
        countryBox.put("Estonia", "Tallinn");
        countryBox.put("Eswatini", "Mbabane"); // administrative, Lobamba is legislative/royal
        countryBox.put("Ethiopia", "Addis Ababa");
        countryBox.put("Fiji", "Suva");
        countryBox.put("Finland", "Helsinki");
        countryBox.put("France", "Paris");
        countryBox.put("Gabon", "Libreville");
        countryBox.put("Gambia", "Banjul");
        countryBox.put("Georgia", "Tbilisi");
        countryBox.put("Germany", "Berlin");
        countryBox.put("Ghana", "Accra");
        countryBox.put("Greece", "Athens");
        countryBox.put("Grenada", "Saint George's");
        countryBox.put("Guatemala", "Guatemala City");
        countryBox.put("Guinea", "Conakry");
        countryBox.put("Guinea-Bissau", "Bissau");
        countryBox.put("Guyana", "Georgetown");
        countryBox.put("Haiti", "Port-au-Prince");
        countryBox.put("Honduras", "Tegucigalpa");
        countryBox.put("Hungary", "Budapest");
        countryBox.put("Iceland", "Reykjavík");
        countryBox.put("India", "New Delhi");
        countryBox.put("Indonesia", "Jakarta");
        countryBox.put("Iran", "Tehran");
        countryBox.put("Iraq", "Baghdad");
        countryBox.put("Ireland", "Dublin");
        countryBox.put("Israel", "Jerusalem");
        countryBox.put("Italy", "Rome");
        countryBox.put("Jamaica", "Kingston");
        countryBox.put("Japan", "Tokyo");
        countryBox.put("Jordan", "Amman");
        countryBox.put("Kazakhstan", "Astana");
        countryBox.put("Kenya", "Nairobi");
        countryBox.put("Kiribati", "Tarawa");
        countryBox.put("Kuwait", "Kuwait City");
        countryBox.put("Kyrgyzstan", "Bishkek");
        countryBox.put("Laos", "Vientiane");
        countryBox.put("Latvia", "Riga");
        countryBox.put("Lebanon", "Beirut");
        countryBox.put("Lesotho", "Maseru");
        countryBox.put("Liberia", "Monrovia");
        countryBox.put("Libya", "Tripoli");
        countryBox.put("Liechtenstein", "Vaduz");
        countryBox.put("Lithuania", "Vilnius");
        countryBox.put("Luxembourg", "Luxembourg");
        countryBox.put("Madagascar", "Antananarivo");
        countryBox.put("Malawi", "Lilongwe");
        countryBox.put("Malaysia", "Kuala Lumpur");
        countryBox.put("Maldives", "Malé");
        countryBox.put("Mali", "Bamako");
        countryBox.put("Malta", "Valletta");
        countryBox.put("Marshall Islands", "Majuro");
        countryBox.put("Mauritania", "Nouakchott");
        countryBox.put("Mauritius", "Port Louis");
        countryBox.put("Mexico", "Mexico City");
        countryBox.put("Micronesia", "Palikir");
        countryBox.put("Moldova", "Chișinău");
        countryBox.put("Monaco", "Monaco");
        countryBox.put("Mongolia", "Ulaanbaatar");
        countryBox.put("Montenegro", "Podgorica");
        countryBox.put("Morocco", "Rabat");
        countryBox.put("Mozambique", "Maputo");
        countryBox.put("Myanmar", "Naypyidaw");
        countryBox.put("Namibia", "Windhoek");
        countryBox.put("Nauru", "Yaren District"); // de facto, no official capital
        countryBox.put("Nepal", "Kathmandu");
        countryBox.put("Netherlands", "Amsterdam"); // The Hague is seat of government
        countryBox.put("New Zealand", "Wellington");
        countryBox.put("Nicaragua", "Managua");
        countryBox.put("Niger", "Niamey");
        countryBox.put("Nigeria", "Abuja");
        countryBox.put("North Korea", "Pyongyang");
        countryBox.put("North Macedonia", "Skopje");
        countryBox.put("Norway", "Oslo");
        countryBox.put("Oman", "Muscat");
        countryBox.put("Pakistan", "Islamabad");
        countryBox.put("Palau", "Ngerulmud");
        countryBox.put("Panama", "Panama City");
        countryBox.put("Papua New Guinea", "Port Moresby");
        countryBox.put("Paraguay", "Asunción");
        countryBox.put("Peru", "Lima");
        countryBox.put("Philippines", "Manila");
        countryBox.put("Poland", "Warsaw");
        countryBox.put("Portugal", "Lisbon");
        countryBox.put("Qatar", "Doha");
        countryBox.put("Romania", "Bucharest");
        countryBox.put("Russia", "Moscow");
        countryBox.put("Rwanda", "Kigali");
        countryBox.put("Saint Kitts and Nevis", "Basseterre");
        countryBox.put("Saint Lucia", "Castries");
        countryBox.put("Saint Vincent and the Grenadines", "Kingstown");
        countryBox.put("Samoa", "Apia");
        countryBox.put("San Marino", "San Marino");
        countryBox.put("Sao Tome and Principe", "São Tomé");
        countryBox.put("Saudi Arabia", "Riyadh");
        countryBox.put("Senegal", "Dakar");
        countryBox.put("Serbia", "Belgrade");
        countryBox.put("Seychelles", "Victoria");
        countryBox.put("Sierra Leone", "Freetown");
        countryBox.put("Singapore", "Singapore");
        countryBox.put("Slovakia", "Bratislava");
        countryBox.put("Slovenia", "Ljubljana");
        countryBox.put("Solomon Islands", "Honiara");
        countryBox.put("Somalia", "Mogadishu");
        countryBox.put("South Africa", "Pretoria"); // administrative, Cape Town (legislative), Bloemfontein (judicial)
        countryBox.put("South Korea", "Seoul");
        countryBox.put("South Sudan", "Juba");
        countryBox.put("Spain", "Madrid");
        countryBox.put("Sri Lanka", "Sri Jayawardenepura Kotte"); // legislative, Colombo is commercial
        countryBox.put("Sudan", "Khartoum");
        countryBox.put("Suriname", "Paramaribo");
        countryBox.put("Sweden", "Stockholm");
        countryBox.put("Switzerland", "Bern");
        countryBox.put("Syria", "Damascus");
        countryBox.put("Tajikistan", "Dushanbe");
        countryBox.put("Tanzania", "Dodoma");
        countryBox.put("Thailand", "Bangkok");
        countryBox.put("Timor-Leste", "Dili");
        countryBox.put("Togo", "Lomé");
        countryBox.put("Tonga", "Nukuʻalofa");
        countryBox.put("Trinidad and Tobago", "Port of Spain");
        countryBox.put("Tunisia", "Tunis");
        countryBox.put("Turkey", "Ankara");
        countryBox.put("Turkmenistan", "Ashgabat");
        countryBox.put("Tuvalu", "Funafuti");
        countryBox.put("Uganda", "Kampala");
        countryBox.put("Ukraine", "Kyiv");
        countryBox.put("United Arab Emirates", "Abu Dhabi");
        countryBox.put("United Kingdom", "London");
        countryBox.put("United States", "Washington, D.C.");
        countryBox.put("Uruguay", "Montevideo");
        countryBox.put("Uzbekistan", "Tashkent");
        countryBox.put("Vanuatu", "Port Vila");
        countryBox.put("Vatican City", "Vatican City");
        countryBox.put("Venezuela", "Caracas");
        countryBox.put("Vietnam", "Hanoi");
        countryBox.put("Yemen", "Sana'a");
        countryBox.put("Zambia", "Lusaka");
        countryBox.put("Zimbabwe", "Harare");

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Country capital finder:\n please enter country name: ");
        String userInput = input.nextLine();
        if( null != countryBox.get(userInput)){
            System.out.printf("The Capital of %s is %s ", userInput , countryBox.get(userInput));
        } else{
            System.out.println("Sorry boss, idk");
        }





    }
}
