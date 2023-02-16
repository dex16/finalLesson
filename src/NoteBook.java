public class NoteBook {
    String ozu;
    String color;
    String memory;
    String operationSystem;

    public NoteBook(String ozu, String color, String memory, String operationSystem) {
        this.color = color;
        this.operationSystem = operationSystem;
        this.ozu = ozu;
        this.memory = memory;
    }

    public String getOzu() {
        return ozu;
    }

    public void setOzu(int ozu) {
        this.ozu = String.valueOf(ozu);
    }


    public String getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = String.valueOf(memory);
    }


    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "ozu=" + ozu +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
