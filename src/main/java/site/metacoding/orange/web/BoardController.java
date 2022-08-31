package site.metacoding.orange.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.AllArgsConstructor;
import site.metacoding.orange.domain.Board;
import site.metacoding.orange.domain.BoardDao;

@Controller
@AllArgsConstructor
public class BoardController {

	private BoardDao boardDao;
	
	@PostMapping("/board")
	public String postData(Board board) {
		boardDao.save(board);
		return "index";
	}
	
	@GetMapping("/board/{id}")
	public String getData(@PathVariable Integer id, Model model) {
		Board board = boardDao.findById(id).get();
		model.addAttribute("board",board);
		return "detail";
	}
}
