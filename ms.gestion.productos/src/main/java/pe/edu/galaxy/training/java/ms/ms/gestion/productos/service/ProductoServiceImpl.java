package pe.edu.galaxy.training.java.ms.ms.gestion.productos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.json.JsonMapper;

import pe.edu.galaxy.training.java.ms.ms.gestion.productos.dto.ProductoDTO;
import pe.edu.galaxy.training.java.ms.ms.gestion.productos.entity.ProductoEntity;
import pe.edu.galaxy.training.java.ms.ms.gestion.productos.repository.ProductoRepository;
import pe.edu.galaxy.training.java.ms.ms.gestion.productos.service.exception.ServiceException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private JsonMapper jsonMapper;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public  ProductoServiceImpl() {
		
	}
	
    @Override
    public List<ProductoDTO> findLike(ProductoDTO productoDTO) throws ServiceException {
    	try {
    		
    		return this.productoRepository.getAllActivos().stream()
    				.map(e-> this.getProductoDTO(e))
    				.collect(Collectors.toList());
		} catch (Exception e) {
			throw new ServiceException(e);
		}
    }

    @Override
    public Optional<ProductoDTO> findById(ProductoDTO productoDTO) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public ProductoDTO save(ProductoDTO productoDTO) throws ServiceException {
        return null;
    }
    
    //Mappers
    
    private ProductoDTO getProductoDTO(ProductoEntity productoEntity ) {
    	return jsonMapper.convertValue(productoEntity, ProductoDTO.class);
    }
}
