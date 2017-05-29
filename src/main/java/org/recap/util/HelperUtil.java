package org.recap.util;

import org.recap.model.jpa.InstitutionEntity;
import org.recap.repository.InstitutionDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sheiks on 03/03/17.
 */
@Component
public class HelperUtil {

    @Autowired
    private InstitutionDetailsRepository institutionDetailsRepository;

    public InstitutionEntity getInstitutionIdByCode(String value) {
        InstitutionEntity institutionEntity = institutionDetailsRepository.findByInstitutionCode(value);
        if(null != institutionEntity) {
            return institutionEntity;
        }
        return null;
    }
}