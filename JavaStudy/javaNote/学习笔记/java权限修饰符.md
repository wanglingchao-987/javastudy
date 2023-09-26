### java权限修饰符

- java中有四种权限修饰符
- public   private   protected   （default）   private
  - （default）不是关键字，而是根本不写关键字。默认为default.
  - 

|                        | public | protect |      | default | private |
| ---------------------- | ------ | ------- | ---- | ------- | ------- |
| 同类中(自己)           | yes    | yes     |      | yes     | yes     |
| 同包中（邻居）         | yes    | yes     |      | yes     | no      |
| 不同包子类（儿子）     | yes    | yes     |      | no      | no      |
| 不同包非子类（陌生人） | yes    | no      |      | no      | no      |

