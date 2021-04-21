/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.gamedev.question.web.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class QuestionController {
	public class Question{
		public String lib;
		public String[] response;
		
		public Question(String lib,String[] rep) {
			this.lib=lib;
			this.response=rep;
		}
	}

	@GetMapping("/question/res_text")
	public String question_res_text() { 
		return "question/text";
	}
	
	@GetMapping("/question/res_choice")
	public String question_res_choice() {
		String [] reponses = {"réponse1","réponse2","réponse3","réponse4"};
		Question question = new Question("nom de la question",reponses);
		return "question/choice";
	}
	
	@GetMapping("/question/res_bool")
	public String question_res_bool() {
		return "question/bool";
	}
	
}
