package org.manumiguezz.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Memory {
    private int memoryId;
    private String memoryType;
    private int memoryCapacity;

    public Memory() {}

    public Memory(int memoryId, String memoryType, int memoryCapacity) {
        this.memoryId = memoryId;
        this.memoryType = memoryType;
        this.memoryCapacity = memoryCapacity;
    }

    @XmlAttribute
    public int getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(int memoryId) {
        this.memoryId = memoryId;
    }

    @XmlAttribute
    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }
}
