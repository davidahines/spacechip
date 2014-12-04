package ships;

//
import com.davidh.space.components.Component;
import com.davidh.space.components.Core;
import com.davidh.space.components.Hull;
import com.davidh.space.components.LifeSupport;
import com.davidh.space.components.PropulsionSystem;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//    aircraft carrier
//    battleship
//    helicopter carrier
//    battlecruiser
//    pocket battleship
//    cruiser
//    destroyer
//    frigate
//    corvette
//    offshore patrol vessel
//    fast attack craft
//
public class Spaceship {

    private String modelNumber;
    private String serialNumber;
    private String shipName;
    private final Set<Component> components = new HashSet<Component>();

    public Spaceship(String modelNumber, String serialNumber, String shipName, HashSet<Component> components) {
        this.modelNumber = modelNumber;
        this.serialNumber = serialNumber;
        this.shipName = shipName;
        this.components.addAll(components);
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    

    public Set<String> checkDesign() {
        boolean hasPropulsion = false;
        boolean hasHull = false;
        boolean hasCore = false;
        boolean hasLifeSupport = false;
        boolean hasFrame = false;
        int energyOutput = 0;
        int energyRequirements = 0;
        Set<String> designFlaws = new HashSet<String>();
        for (Component c : components) {
            if (c instanceof PropulsionSystem) {
                hasPropulsion = true;
            }
            if (c instanceof Hull){
                hasHull = true;
            }
            if (c instanceof LifeSupport){
                hasLifeSupport = true;
            }
            if(c instanceof Core){
                hasCore = true;
                energyOutput += ((Core)c).getEnergyOutput();
            }
            
        }
        
        if(energyRequirements > energyOutput){
            designFlaws.add("The ship's systems use too much energy.");
        }
        if(!hasPropulsion){
            designFlaws.add("Ships need propulsion to get anywhere.");
        }
        if(!hasCore){
            designFlaws.add("Ships need a core to power com.davidh.space.components.components.");
        }
        if(!hasLifeSupport){
            designFlaws.add("Ships need life support, to keep the personell alive.");
        }
        if(!hasHull){
            designFlaws.add("Ships need a hull to protect the systems and personell.");
        }
        if(!hasFrame){
            designFlaws.add("Ships need a frame to house the interior of the ship.");
        }
        return designFlaws;
    }
}
