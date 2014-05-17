/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.dao;

import net.smktarunabhakti.penjualan.domain.Penjualan;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Shintaro Kisaragi
 */
public interface PenjualanDao extends PagingAndSortingRepository<Penjualan, String> {
    
}
