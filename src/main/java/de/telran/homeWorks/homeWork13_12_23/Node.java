package de.telran.homeWorks.homeWork13_12_23;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Node {
    private int key;
    private String value;
    private Node left;
    private Node right;

    public void printNode() {
        System.out.println(value);
    }

}
