/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class av
extends AbstractList {
    private final Set a = new HashSet();
    private final List b = new ArrayList();

    public boolean a(URI uRI) {
        return this.a.contains(uRI);
    }

    public void b(URI uRI) {
        this.a.add(uRI);
        this.b.add(uRI);
    }

    public boolean c(URI uRI) {
        boolean bl2 = this.a.remove(uRI);
        if (bl2) {
            Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                URI uRI2 = (URI)iterator.next();
                if (!uRI2.equals(uRI)) continue;
                iterator.remove();
            }
        }
        return bl2;
    }

    public List a() {
        return new ArrayList(this.b);
    }

    public URI a(int n2) {
        return (URI)this.b.get(n2);
    }

    public int size() {
        return this.b.size();
    }

    public Object set(int n2, Object object) {
        URI uRI = this.b.set(n2, (URI)object);
        this.a.remove(uRI);
        this.a.add((URI)object);
        if (this.b.size() != this.a.size()) {
            this.a.addAll(this.b);
        }
        return uRI;
    }

    public void add(int n2, Object object) {
        this.b.add(n2, (URI)object);
        this.a.add((URI)object);
    }

    public URI b(int n2) {
        URI uRI = (URI)this.b.remove(n2);
        this.a.remove(uRI);
        if (this.b.size() != this.a.size()) {
            this.a.addAll(this.b);
        }
        return uRI;
    }

    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    public /* synthetic */ Object remove(int n2) {
        return this.b(n2);
    }

    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

