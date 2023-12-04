package com.example.paint.backend.paint.services.shapes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY, visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Square.class, name = "square"),
        @JsonSubTypes.Type(value = Circle.class, name = "circle"),
        @JsonSubTypes.Type(value = Elipse.class, name = "elipse"),
        @JsonSubTypes.Type(value = Rectangle.class, name = "rectangle"),
        @JsonSubTypes.Type(value = Line.class, name = "line"),
        @JsonSubTypes.Type(value = Triangle.class, name = "triangle")

})
@JsonIgnoreProperties(value = "attributes",ignoreUnknown = true)
public abstract class shape implements Cloneable {
    private double x ;
    private double y ;
    private String id;
    private String fill;
    private String name ;
    private String stroke;
    private double strokeWidth;
    private double rotation;
    private boolean draggable ;
    private double scaleY ;
    private double scaleX ;
    public shape(shapeDTO dto){
        this.x = dto.x ;
        this.y = dto.y ;
        this.id = dto.id ;
        this.fill = dto.fill ;
        this.name = dto.name ;
        this.stroke = dto.stroke ;
        this.strokeWidth = dto.strokeWidth ;
        this.rotation = dto.rotation ;
        this.draggable = dto.draggable ;
        if(dto.scaleX == 0 )
            this.scaleX = 1 ;
        else
            this.scaleX = dto.scaleX ;
        if(dto.scaleY == 0 )
            this.scaleY = 1 ;
        else
            this.scaleY = dto.scaleY ;
    }
    public shape(shape s){
        this.x = s.x + 10 ;
        this.y = s.y + 20;
        this.id = s.id ;
        this.fill = s.fill ;
        this.name = s.name ;
        this.stroke = s.stroke ;
        this.strokeWidth = s.strokeWidth ;
        this.rotation = s.rotation ;
        this.draggable = s.draggable ;
        this.scaleX = s.scaleX ;
        this.scaleY = s.scaleY ;
    }

    public shape(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDraggable(boolean draggable) {
        this.draggable = draggable;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public void setStrokeWidth(double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setScaleX(double scaleX) {
        this.scaleX = scaleX;
    }

    public void setScaleY(double scaleY) {
        this.scaleY = scaleY;
    }

    public String getName() {
        return name;
    }

    public double getRotation() {
        return rotation;
    }

    public double getStrokeWidth() {
        return strokeWidth;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getFill() {
        return fill;
    }

    public String getId() {
        return id;
    }

    public String getStroke() {
        return stroke;
    }

    public boolean getDraggable() {
        return draggable;
    }

    public double getScaleX() {
        return scaleX;
    }

    public double getScaleY() {
        return scaleY;
    }

    // public abstract void drawShape() ;
    public abstract shape clone( String idNew)throws CloneNotSupportedException ;

}
