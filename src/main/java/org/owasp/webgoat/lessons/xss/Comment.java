package org.owasp.webgoat.lessons.xss;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.*;

/**
 * @author nbaars
 * @since 4/8/17.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@ToString
public class Comment {
  private String user;
  private String dateTime;
  private String text;
}
