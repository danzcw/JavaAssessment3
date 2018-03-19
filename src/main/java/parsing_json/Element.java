package parsing_json;

import java.util.ArrayList;

public class Element {

    String name;
    String appearance;
    Double atomic_mass;
    Double boil;
    String category;
    String color;
    Double density;
    String discovered_by;
    Double melt;
    Double molar_heat;
    String named_by;
    int number;
    int period;
    String phase;
    String source;
    String spectral_img;
    String summary;
    String symbol;
    int xpos;
    int ypos;
    ArrayList<Integer> shells;


    public Element() {
        this.name = name;
        this.appearance = appearance;
        this.atomic_mass = atomic_mass;
        this.boil = boil;
        this.category = category;
        this.color = color;
        this.density = density;
        this.discovered_by = discovered_by;
        this.melt = melt;
        this.molar_heat = molar_heat;
        this.named_by = named_by;
        this.number = number;
        this.period = period;
        this.phase = phase;
        this.source = source;
        this.spectral_img = spectral_img;
        this.summary = summary;
        this.symbol = symbol;
        this.xpos = xpos;
        this.ypos = ypos;
        this.shells = shells;
    }

    public Element(String name, String appearance, Double atomic_mass, Double boil, String category, String color, Double density, String discovered_by, Double melt, Double molar_heat, String named_by, int number, int period, String phase, String source, String spectral_img, String summary, String symbol, int xpos, int ypos, ArrayList<Integer> shells) {
        this.name = name;
        this.appearance = appearance;
        this.atomic_mass = atomic_mass;
        this.boil = boil;
        this.category = category;
        this.color = color;
        this.density = density;
        this.discovered_by = discovered_by;
        this.melt = melt;
        this.molar_heat = molar_heat;
        this.named_by = named_by;
        this.number = number;
        this.period = period;
        this.phase = phase;
        this.source = source;
        this.spectral_img = spectral_img;
        this.summary = summary;
        this.symbol = symbol;
        this.xpos = xpos;
        this.ypos = ypos;
        this.shells = shells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public Double getAtomic_mass() {
        return atomic_mass;
    }

    public void setAtomic_mass(Double atomic_mass) {
        this.atomic_mass = atomic_mass;
    }

    public Double getBoil() {
        return boil;
    }

    public void setBoil(Double boil) {
        this.boil = boil;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public void setDiscovered_by(String discovered_by) {
        this.discovered_by = discovered_by;
    }

    public Double getMelt() {
        return melt;
    }

    public void setMelt(Double melt) {
        this.melt = melt;
    }

    public Double getMolar_heat() {
        return molar_heat;
    }

    public void setMolar_heat(Double molar_heat) {
        this.molar_heat = molar_heat;
    }

    public String getNamed_by() {
        return named_by;
    }

    public void setNamed_by(String named_by) {
        this.named_by = named_by;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSpectral_img() {
        return spectral_img;
    }

    public void setSpectral_img(String spectral_img) {
        this.spectral_img = spectral_img;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getXpos() {
        return xpos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public ArrayList<Integer> getShells() {
        return shells;
    }

    public void setShells(ArrayList<Integer> shells) {
        this.shells = shells;
    }
}


