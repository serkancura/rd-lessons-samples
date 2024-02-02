package org.rd.lessons.lesson15.DesingPattern.lombook;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Bilgisayar {
    private String marka;
    private String islemci;
    private int ram;
    private int depolama;
}
