/**
 * $License$
 *
 * $Id: StrategyAgentEngineAdapterFactory.java 10885 2009-11-17 19:22:56Z klim $
 */
package org.marketcetera.photon.strategy.engine.model.sa.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.marketcetera.photon.strategy.engine.model.core.StrategyEngine;

import org.marketcetera.photon.strategy.engine.model.sa.*;

import org.marketcetera.util.misc.ClassVersion;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.marketcetera.photon.strategy.engine.model.sa.StrategyAgentEnginePackage
 * @generated
 * @since 2.0.0
 */
@ClassVersion("$Id: StrategyAgentEngineAdapterFactory.java 10885 2009-11-17 19:22:56Z klim $")
public class StrategyAgentEngineAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static StrategyAgentEnginePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StrategyAgentEngineAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = StrategyAgentEnginePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StrategyAgentEngineSwitch<Adapter> modelSwitch = new StrategyAgentEngineSwitch<Adapter>() {
        @Override
        public Adapter caseStrategyAgentEngine(StrategyAgentEngine object) {
            return createStrategyAgentEngineAdapter();
        }

        @Override
        public Adapter caseStrategyEngine(StrategyEngine object) {
            return createStrategyEngineAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.marketcetera.photon.strategy.engine.model.sa.StrategyAgentEngine <em>Strategy Agent Engine</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.marketcetera.photon.strategy.engine.model.sa.StrategyAgentEngine
     * @generated
     */
    public Adapter createStrategyAgentEngineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.marketcetera.photon.strategy.engine.model.core.StrategyEngine <em>Strategy Engine</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.marketcetera.photon.strategy.engine.model.core.StrategyEngine
     * @generated
     */
    public Adapter createStrategyEngineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //StrategyAgentEngineAdapterFactory
