package com.rnd.aws.service;


import com.rnd.aws.document.AthDocument;
import com.rnd.aws.exception.ApplicationException;
import com.rnd.aws.model.AthModel;
import com.rnd.aws.repository.AthRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AthService {
    @Autowired
    private AthRepository athRepository;

    public ResponseEntity<?> search(String key, String value){
        try{
            List<AthDocument> athDocuments = athRepository.findByUsingQuery(key, value);
            if (athDocuments.isEmpty()) {
                return new ResponseEntity<>("No existe información", HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(getAth(athDocuments), HttpStatus.OK);

        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getCause(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    private List<AthModel> getAth(Iterable<AthDocument> athDocuments) {
        List<AthModel> athModelList = new ArrayList<>();
        athDocuments.forEach(e -> athModelList.add(getAthModel(e)));
        return athModelList;
    }

    private AthModel getAthModel(AthDocument athDocument) {
        AthModel athModel = new AthModel();
        BeanUtils.copyProperties(athDocument, athModel);
        return athModel;
    }
}
