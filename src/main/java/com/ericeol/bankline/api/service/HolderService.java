package com.ericeol.bankline.api.service;

import com.ericeol.bankline.api.dto.HolderDTO;
import com.ericeol.bankline.api.model.Account;
import com.ericeol.bankline.api.model.Holder;
import com.ericeol.bankline.api.repository.HolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HolderService {

    @Autowired
    HolderRepository holderRepository;

    public void add(HolderDTO holderDTO) {
        Holder holder = new Holder();
        holder.setCpf(holderDTO.getCpf());
        holder.setName(holderDTO.getName());

        Account account = new Account();
        account.setBalance(0.0);
        account.setNumber(new Date().getTime());

        holder.setAccount(account);

        holderRepository.save(holder);
    }
}
