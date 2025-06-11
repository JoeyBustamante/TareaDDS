package src;

public aspect LoggerAspect {
    after(ColorChanger changer): execution(void ColorChanger.changeColor()) && this(changer) {
        System.out.println("AspectJ: Color cambiado a → " + changer.getColorName());
    }
}
