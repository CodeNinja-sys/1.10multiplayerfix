/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.Comparator;

enum af implements Comparator
{
    a;


    public int compare(Object object, Object object2) {
        return ((Comparable)object).compareTo(object2);
    }
}

