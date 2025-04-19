package trabalho;

public enum Pais {

    PORTUGAL(0,"Lisboa"), ESPANHA(1,"Madrid"), REINOUNIDO(2,"Londres"), BELGICA(3,"Bruxelas"), HOLANDA(4,"Amsterdam"), 
    FRANCA(5,"Paris"), SUICA(6,"Berna"), ITALIA(7,"Roma"), DINAMARCA(8,"Copenhague"),SUECIA(9,"Estocolmo"),
    NORUEGA(10,"Oslo"), ALEMANHA(11,"Berlim"), POLONIA(12,"Varsovia"), AUSTRIA(13,"Vienna"), HUNGRIA(14,"Budapesta"),
    ESLOVENIA(15,"Liubliana"), CROACIA(16,"Zagreb"),TCHEQUIA(17,"Praga"),ESLOVAQUIA(18,"Bratislava"),UCRANIA(19,"Kiev"),
    BIELORUSSIA(20,"Minsk"),ROMENIA(21,"Bucareste"),MOLDAVIA(22,"Chisinau"),BOSNIAHERZEGOVINA(23,"Sarajevo"),
    SERVIA(24,"Belgrado"),MONTENEGRO(25,"Podgorica"),KOSOVO(26,"Pristina"),ALBANIA(27,"Tirana"),MACEDONIADONORTE(28,"Escopia"),
    BULGARIA(29,"Sofia"),GRECIA(30,"Atenas"),LITUANIA(31,"Vilnius"),LETONIA(32,"Riga"),ESTONIA(33,"Tallinn"),
    FINLANDIA(34,"Helsinque"),RUSSIA(35,"Moscou"), LUXEMBURGO(36,"Luxemburgo");

    private int valorPais;
    private String capitalPais;

    private Pais(int valor, String capital) {
        this.valorPais = valor;
        this.capitalPais = capital;
    }
    public int getValor() {
        return this.valorPais;
    }
    public String getCapitalPais() {
    	return this.capitalPais;
    }

}