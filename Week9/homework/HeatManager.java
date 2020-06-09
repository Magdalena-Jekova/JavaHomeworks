package homework;

public class HeatManager{
    private int temperature;
    private HeatEngine[] heatEngines;
    private WrapperEngine[] wrapperEngines;

    HeatManager(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public HeatEngine[] getHeatEngines() {
        return heatEngines;
    }

    public void setHeatEngines(HeatEngine[] heatEngines) {
        this.heatEngines = heatEngines;
    }

    public WrapperEngine[] getWrapperEngines() {
        return wrapperEngines;
    }

    public void setWrapperEngines(WrapperEngine[] wrapperEngines) {
        this.wrapperEngines = wrapperEngines;
    }
}
