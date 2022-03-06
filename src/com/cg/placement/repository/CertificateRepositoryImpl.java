package com.cg.placement.repository;

import com.cg.placement.entities.Certificate;

import javax.persistence.EntityManager;

public class CertificateRepositoryImpl implements ICertificateRepository {
    //  Step 1: Start JPA LifeCycle
    private  EntityManager entityManager;
    public CertificateRepositoryImpl(){
        entityManager =JPAUtil.getEntityManager();
    }

    //crud operation
    @Override
    public Certificate addCertificate(Certificate certificate) {
        entityManager.persist(certificate); //adding
        return certificate;
    }

    @Override
    public Certificate updateCertificate(Certificate certificate) {
        entityManager.merge(certificate);  //update
        return certificate;
    }

    @Override
    public Certificate searchCertificate(int id ) {
        return entityManager.find(Certificate.class,id);
    }

    @Override
    public Certificate deleteCertificate(int id) {
        Certificate certificate= entityManager.find(Certificate.class,id);
        entityManager.remove(certificate);
        return certificate;
    }



    @Override
    public void beginTransaction() { entityManager.getTransaction().begin(); }

    @Override
    public void commitTransaction() {
        entityManager.getTransaction().commit();
    }
}
