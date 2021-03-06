
/**
 * 
 * <p>
 * <b> DonativoListener.java </b>
 * </p>
 *
 * <p>
 * Entidade ...
 * </p>
 * 
 * @author <a href="https://github.com/JoseRafael97">Rafael Feitosa</a>
 */
package br.edu.ifpb.ajudeMais.service.event.donativo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.edu.ifpb.ajudeMais.domain.entity.Imagem;
import br.edu.ifpb.ajudeMais.service.event.doador.DoadorEditEvent;
import br.edu.ifpb.ajudeMais.service.storage.ImagemStorage;

/**
 * 
 * <p>
 * <b> {@link DonativoListener} </b>
 * </p>
 *
 * <p>
 * Classe utilizada para registro de eventos relacionados a donativo. Sempre que
 * um evento for chamado e o mesmo esteja registrado nesta classe, então é
 * executada a tarefa para este listener.
 * </p>
 * 
 * @author <a href="https://github.com/JoseRafael97">Rafael Feitosa</a>
 */
@Component
public class DonativoListener {

	/**
	 * 
	 */
	@Autowired
	private ImagemStorage imagemStorage;

	/**
	 * 
	 * <p>
	 * Salva a imagem em diretório final sempre que o evento
	 * {@link DoadorEditEvent} for chamado.
	 * </p>
	 * 
	 * @param event
	 */
	@EventListener(condition = "#event.image")
	public void doadorEdited(DonativoEditEvent event) {

		for (Imagem image : event.getDonativo().getFotosDonativo()) {
			String foto = image.getNome();
			if (!imagemStorage.exists(foto)) {
				imagemStorage.save(foto);
			}
		}
	}
}
