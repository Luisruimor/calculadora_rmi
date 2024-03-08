package test;

import org.junit.Test;
import Interfaz;


import java.rmi.RemoteException;


import static org.junit.Assert.assertEquals;


public class ClienteTest {


    private static class MockInterfaz implements Interfaz {
        @Override
        public float sumar(float numero1, float numero2, float numero3) throws RemoteException {
            return numero1 + numero2 + numero3;
        }

        @Override
        public float restar(float numero1, float numero2) throws RemoteException {
            return numero1-numero2;
        }

        @Override
        public float multiplicar(float numero1, float numero2, float numero3) throws RemoteException {
            return numero1*numero2*numero3;
        }

        @Override
        public float dividir(float numero1, float numero2) throws RemoteException {
            return numero1/numero2;
        }

        @Override
        public float raiz(float numero1) throws RemoteException {
            return (float) Math.sqrt(numero1);
        }
    }

    private MockInterfaz calculadora = new MockInterfaz();

    @Test
    public void testSuma() throws RemoteException {
        assertEquals(6.0, calculadora.sumar(1.0f, 2.0f, 3.0f), 0.001);
    }

    @Test
    public void testResta() throws RemoteException {
        assertEquals(1.0, calculadora.restar(3.0f, 2.0f), 0.001);
    }

    @Test
    public void testMultiplicacion() throws RemoteException {
        assertEquals(6.0, calculadora.multiplicar(1.0f, 2.0f, 3.0f), 0.001);
    }

    @Test
    public void testDivision() throws RemoteException {
        assertEquals(2.0, calculadora.dividir(4.0f, 2.0f), 0.001);
    }

    @Test
    public void testRaiz() throws RemoteException {
        assertEquals(4.0, calculadora.raiz(16.0f), 0.001);
    }
}