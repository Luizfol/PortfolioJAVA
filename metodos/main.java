package metodos;

public class main {
public static void main(String[] args) {
luffy luffy = new luffy();
luffy.nome = "luffy";
luffy.recompensa = 3000000000l;
luffy.tesouro = "Sunny";
luffy.objetivo = "rei dos piratas";

sanji sanji = new sanji();
zoro zoro = new zoro();
sanji.nome = "sanji";
sanji.objetivo = "Luffy ser rei";
sanji.recompensa = 10000l;
sanji.tesouro = "sunny";
zoro.nome = "zoro";
zoro.objetivo = "Luffy ser rei";
zoro.recompensa = 10000l;
zoro.tesouro = "Sunny";

luffy.atacar();
zoro.atacar();
sanji.atacar();

piratas piratas = new piratas();
piratas.atacar();

brook brook =  new brook();
brook.atacar();
    





}

}
