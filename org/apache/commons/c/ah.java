/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.apache.commons.c.ag;
import org.apache.commons.c.ai;

public class ah {
    public static Serializable a(Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        byte[] arrby = ah.c(serializable);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
        ObjectInputStream objectInputStream = null;
        try {
            Serializable serializable2;
            objectInputStream = new ai(byteArrayInputStream, serializable.getClass().getClassLoader());
            Serializable serializable3 = serializable2 = (Serializable)objectInputStream.readObject();
            return serializable3;
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new ag("ClassNotFoundException while reading cloned object data", classNotFoundException);
        }
        catch (IOException iOException) {
            throw new ag("IOException while reading cloned object data", iOException);
        }
        finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            }
            catch (IOException iOException) {
                throw new ag("IOException on closing cloned object data InputStream.", iOException);
            }
        }
    }

    public static Serializable b(Serializable serializable) {
        return (Serializable)ah.a(ah.c(serializable));
    }

    public static void a(Serializable serializable, OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("The OutputStream must not be null");
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(serializable);
        }
        catch (IOException iOException) {
            throw new ag(iOException);
        }
        finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            }
            catch (IOException iOException) {}
        }
    }

    public static byte[] c(Serializable serializable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        ah.a(serializable, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Object a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("The InputStream must not be null");
        }
        ObjectInputStream objectInputStream = null;
        try {
            Object object;
            objectInputStream = new ObjectInputStream(inputStream);
            Object object2 = object = objectInputStream.readObject();
            return object2;
        }
        catch (ClassCastException classCastException) {
            throw new ag(classCastException);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new ag(classNotFoundException);
        }
        catch (IOException iOException) {
            throw new ag(iOException);
        }
        finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            }
            catch (IOException iOException) {}
        }
    }

    public static Object a(byte[] arrby) {
        if (arrby == null) {
            throw new IllegalArgumentException("The byte[] must not be null");
        }
        return ah.a(new ByteArrayInputStream(arrby));
    }
}

