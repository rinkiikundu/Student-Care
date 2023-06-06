/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.service;
import edu.neu.csye6200.model.AbsolutePersonClass;


public abstract class AbsolutePersonFactory<T extends AbsolutePersonClass> {
    public abstract T getObject(String csvData);
    public abstract T getObject();
}
