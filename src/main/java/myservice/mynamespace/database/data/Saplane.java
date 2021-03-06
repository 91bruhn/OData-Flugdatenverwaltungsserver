package myservice.mynamespace.database.data;

import myservice.mynamespace.database.data.enums.UnitOfLength;
import myservice.mynamespace.database.data.enums.UnitOfMass;
import myservice.mynamespace.database.data.enums.UnitOfSpeed;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import static myservice.mynamespace.util.EntityNames.SAPLANE;
import static myservice.mynamespace.util.EntityNames.SAPLANE_CAP_UNIT;
import static myservice.mynamespace.util.EntityNames.SAPLANE_CONSUM;
import static myservice.mynamespace.util.EntityNames.SAPLANE_CON_UNIT;
import static myservice.mynamespace.util.EntityNames.SAPLANE_LENG;
import static myservice.mynamespace.util.EntityNames.SAPLANE_LENG_UNIT;
import static myservice.mynamespace.util.EntityNames.SAPLANE_OP_SPEED;
import static myservice.mynamespace.util.EntityNames.SAPLANE_PLANETYPE;
import static myservice.mynamespace.util.EntityNames.SAPLANE_PRODUCER;
import static myservice.mynamespace.util.EntityNames.SAPLANE_SEATSMAX;
import static myservice.mynamespace.util.EntityNames.SAPLANE_SEATSMAX_B;
import static myservice.mynamespace.util.EntityNames.SAPLANE_SEATSMAX_F;
import static myservice.mynamespace.util.EntityNames.SAPLANE_SPAN;
import static myservice.mynamespace.util.EntityNames.SAPLANE_SPAN_UNIT;
import static myservice.mynamespace.util.EntityNames.SAPLANE_SPEED_UNIT;
import static myservice.mynamespace.util.EntityNames.SAPLANE_TANKCAP;
import static myservice.mynamespace.util.EntityNames.SAPLANE_WEIGHT;
import static myservice.mynamespace.util.EntityNames.SAPLANE_WEI_UNIT;

/**
 * Created by bruhn on 09.12.2017.
 */
@Entity(value = SAPLANE, noClassnameStored = true)
public class Saplane {

    @Id
    @Property(SAPLANE_PLANETYPE)
    private String planeType;//todo prime

    @Property(SAPLANE_SEATSMAX)
    private int seatsMax;//todo auch in sflight

    @Property(SAPLANE_CONSUM)
    private double consum;

    @Property(SAPLANE_CON_UNIT)
    private UnitOfMass conUnit;

    @Property(SAPLANE_TANKCAP)
    private double tankCap;

    @Property(SAPLANE_CAP_UNIT)
    private UnitOfMass capUnit;

    @Property(SAPLANE_WEIGHT)
    private double weight;

    @Property(SAPLANE_WEI_UNIT)
    private UnitOfMass weiUnit;

    @Property(SAPLANE_SPAN)
    private double span;

    @Property(SAPLANE_SPAN_UNIT)
    private UnitOfLength spanUnit;

    @Property(SAPLANE_LENG)
    private double length;

    @Property(SAPLANE_LENG_UNIT)
    private UnitOfLength lengUnit;

    @Property(SAPLANE_OP_SPEED)
    private double opSpeed;

    @Property(SAPLANE_SPEED_UNIT)
    private UnitOfSpeed speedUnit;

    @Property(SAPLANE_PRODUCER)
    private String producer;

    @Property(SAPLANE_SEATSMAX_B)
    private int seatsMaxB;

    @Property(SAPLANE_SEATSMAX_F)
    private int seatsMaxF;

    public Saplane() {}

    public Saplane(String planeType, int seatsMax, double consum, UnitOfMass conUnit, double tankCap, UnitOfMass capUnit, double weight, UnitOfMass weiUnit,
                   double span, UnitOfLength spanUnit, double length, UnitOfLength lengUnit, double opSpeed, UnitOfSpeed speedUnit, String producer,
                   int seatsMaxB, int seatsMaxF) {
        this.planeType = planeType;
        this.seatsMax = seatsMax;
        this.consum = consum;
        this.conUnit = conUnit;
        this.tankCap = tankCap;
        this.capUnit = capUnit;
        this.weight = weight;
        this.weiUnit = weiUnit;
        this.span = span;
        this.spanUnit = spanUnit;
        this.length = length;
        this.lengUnit = lengUnit;
        this.opSpeed = opSpeed;
        this.speedUnit = speedUnit;
        this.producer = producer;
        this.seatsMaxB = seatsMaxB;
        this.seatsMaxF = seatsMaxF;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getSeatsMax() {
        return seatsMax;
    }

    public void setSeatsMax(int seatsMax) {
        this.seatsMax = seatsMax;
    }

    public double getConsum() {
        return consum;
    }

    public void setConsum(double consum) {
        this.consum = consum;
    }

    public UnitOfMass getConUnit() {
        return conUnit;
    }

    public void setConUnit(UnitOfMass conUnit) {
        this.conUnit = conUnit;
    }

    public double getTankCap() {
        return tankCap;
    }

    public void setTankCap(double tankCap) {
        this.tankCap = tankCap;
    }

    public UnitOfMass getCapUnit() {
        return capUnit;
    }

    public void setCapUnit(UnitOfMass capUnit) {
        this.capUnit = capUnit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public UnitOfMass getWeiUnit() {
        return weiUnit;
    }

    public void setWeiUnit(UnitOfMass weiUnit) {
        this.weiUnit = weiUnit;
    }

    public double getSpan() {
        return span;
    }

    public void setSpan(double span) {
        this.span = span;
    }

    public UnitOfLength getSpanUnit() {
        return spanUnit;
    }

    public void setSpanUnit(UnitOfLength spanUnit) {
        this.spanUnit = spanUnit;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public UnitOfLength getLengUnit() {
        return lengUnit;
    }

    public void setLengUnit(UnitOfLength lengUnit) {
        this.lengUnit = lengUnit;
    }

    public double getOpSpeed() {
        return opSpeed;
    }

    public void setOpSpeed(double opSpeed) {
        this.opSpeed = opSpeed;
    }

    public UnitOfSpeed getSpeedUnit() {
        return speedUnit;
    }

    public void setSpeedUnit(UnitOfSpeed speedUnit) {
        this.speedUnit = speedUnit;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getSeatsMaxB() {
        return seatsMaxB;
    }

    public void setSeatsMaxB(int seatsMaxB) {
        this.seatsMaxB = seatsMaxB;
    }

    public int getSeatsMaxF() {
        return seatsMaxF;
    }

    public void setSeatsMaxF(int seatsMaxF) {
        this.seatsMaxF = seatsMaxF;
    }
}
