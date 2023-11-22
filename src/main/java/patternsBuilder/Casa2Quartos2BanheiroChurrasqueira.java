package patternsBuilder;

import modelo.Casa;

public class Casa2Quartos2BanheiroChurrasqueira implements IBuilderCasa{
        Casa casa = new Casa();
    public Casa2Quartos2BanheiroChurrasqueira() {

        casa = new Casa(3, 2, true);
    }
    @Override
    public void buildQuartos() {

        System.out.println("Um quarto 2,5 x 1,90 outro 2,3 x 1,80");
    }
    @Override
    public void buildBanheiros() {

        System.out.println("2 Banheiro 2,3 x 1,25");
    }
    @Override
    public void buildChurrasqueira() {

        System.out.println("Com churrasqueira");
    }
    @Override
    public Casa getCasa() {
        return casa;
    }
}
