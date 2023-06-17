/*
 * Decompiled with CFR 0.150.
 */
package com.c.b;

import com.a.a.b.cm;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.ModificationItem;
import javax.naming.directory.SearchControls;

public class b
implements DirContext {
    private final cm a;
    private final DirContext b;

    public b(cm cm2, DirContext dirContext) {
        this.a = cm2;
        this.b = dirContext;
    }

    @Override
    public Attributes getAttributes(String string) {
        if (this.a.a(string)) {
            return new BasicAttributes();
        }
        return this.b.getAttributes(string);
    }

    @Override
    public Attributes getAttributes(String string, String[] arrstring) {
        if (this.a.a(string)) {
            return new BasicAttributes();
        }
        return this.b.getAttributes(string, arrstring);
    }

    @Override
    public Attributes getAttributes(Name name) {
        return this.b.getAttributes(name);
    }

    @Override
    public Attributes getAttributes(Name name, String[] arrstring) {
        return this.b.getAttributes(name, arrstring);
    }

    @Override
    public void modifyAttributes(Name name, int n2, Attributes attributes) {
        this.b.modifyAttributes(name, n2, attributes);
    }

    @Override
    public void modifyAttributes(String string, int n2, Attributes attributes) {
        this.b.modifyAttributes(string, n2, attributes);
    }

    @Override
    public void modifyAttributes(Name name, ModificationItem[] arrmodificationItem) {
        this.b.modifyAttributes(name, arrmodificationItem);
    }

    @Override
    public void modifyAttributes(String string, ModificationItem[] arrmodificationItem) {
        this.b.modifyAttributes(string, arrmodificationItem);
    }

    @Override
    public void bind(Name name, Object object, Attributes attributes) {
        this.b.bind(name, object, attributes);
    }

    @Override
    public void bind(String string, Object object, Attributes attributes) {
        this.b.bind(string, object, attributes);
    }

    @Override
    public void rebind(Name name, Object object, Attributes attributes) {
        this.b.rebind(name, object, attributes);
    }

    @Override
    public void rebind(String string, Object object, Attributes attributes) {
        this.b.rebind(string, object, attributes);
    }

    @Override
    public DirContext createSubcontext(Name name, Attributes attributes) {
        return this.b.createSubcontext(name, attributes);
    }

    @Override
    public DirContext createSubcontext(String string, Attributes attributes) {
        return this.b.createSubcontext(string, attributes);
    }

    @Override
    public DirContext getSchema(Name name) {
        return this.b.getSchema(name);
    }

    @Override
    public DirContext getSchema(String string) {
        return this.b.getSchema(string);
    }

    @Override
    public DirContext getSchemaClassDefinition(Name name) {
        return this.b.getSchemaClassDefinition(name);
    }

    @Override
    public DirContext getSchemaClassDefinition(String string) {
        return this.b.getSchemaClassDefinition(string);
    }

    public NamingEnumeration search(Name name, Attributes attributes, String[] arrstring) {
        return this.b.search(name, attributes, arrstring);
    }

    public NamingEnumeration search(String string, Attributes attributes, String[] arrstring) {
        return this.b.search(string, attributes, arrstring);
    }

    public NamingEnumeration search(Name name, Attributes attributes) {
        return this.b.search(name, attributes);
    }

    public NamingEnumeration search(String string, Attributes attributes) {
        return this.b.search(string, attributes);
    }

    public NamingEnumeration search(Name name, String string, SearchControls searchControls) {
        return this.b.search(name, string, searchControls);
    }

    public NamingEnumeration search(String string, String string2, SearchControls searchControls) {
        return this.b.search(string, string2, searchControls);
    }

    public NamingEnumeration search(Name name, String string, Object[] arrobject, SearchControls searchControls) {
        return this.b.search(name, string, arrobject, searchControls);
    }

    public NamingEnumeration search(String string, String string2, Object[] arrobject, SearchControls searchControls) {
        return this.b.search(string, string2, arrobject, searchControls);
    }

    @Override
    public Object lookup(Name name) {
        return this.b.lookup(name);
    }

    @Override
    public Object lookup(String string) {
        return this.b.lookup(string);
    }

    @Override
    public void bind(Name name, Object object) {
        this.b.bind(name, object);
    }

    @Override
    public void bind(String string, Object object) {
        this.b.bind(string, object);
    }

    @Override
    public void rebind(Name name, Object object) {
        this.b.rebind(name, object);
    }

    @Override
    public void rebind(String string, Object object) {
        this.b.rebind(string, object);
    }

    @Override
    public void unbind(Name name) {
        this.b.unbind(name);
    }

    @Override
    public void unbind(String string) {
        this.b.unbind(string);
    }

    @Override
    public void rename(Name name, Name name2) {
        this.b.rename(name, name2);
    }

    @Override
    public void rename(String string, String string2) {
        this.b.rename(string, string2);
    }

    public NamingEnumeration list(Name name) {
        return this.b.list(name);
    }

    public NamingEnumeration list(String string) {
        return this.b.list(string);
    }

    public NamingEnumeration listBindings(Name name) {
        return this.b.listBindings(name);
    }

    public NamingEnumeration listBindings(String string) {
        return this.b.listBindings(string);
    }

    @Override
    public void destroySubcontext(Name name) {
        this.b.destroySubcontext(name);
    }

    @Override
    public void destroySubcontext(String string) {
        this.b.destroySubcontext(string);
    }

    @Override
    public Context createSubcontext(Name name) {
        return this.b.createSubcontext(name);
    }

    @Override
    public Context createSubcontext(String string) {
        return this.b.createSubcontext(string);
    }

    @Override
    public Object lookupLink(Name name) {
        return this.b.lookupLink(name);
    }

    @Override
    public Object lookupLink(String string) {
        return this.b.lookupLink(string);
    }

    @Override
    public NameParser getNameParser(Name name) {
        return this.b.getNameParser(name);
    }

    @Override
    public NameParser getNameParser(String string) {
        return this.b.getNameParser(string);
    }

    @Override
    public Name composeName(Name name, Name name2) {
        return this.b.composeName(name, name2);
    }

    @Override
    public String composeName(String string, String string2) {
        return this.b.composeName(string, string2);
    }

    @Override
    public Object addToEnvironment(String string, Object object) {
        return this.b.addToEnvironment(string, object);
    }

    @Override
    public Object removeFromEnvironment(String string) {
        return this.b.removeFromEnvironment(string);
    }

    public Hashtable getEnvironment() {
        return this.b.getEnvironment();
    }

    @Override
    public void close() {
        this.b.close();
    }

    @Override
    public String getNameInNamespace() {
        return this.b.getNameInNamespace();
    }
}

